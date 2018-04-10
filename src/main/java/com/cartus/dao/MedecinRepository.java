package com.cartus.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cartus.entities.Medecin;

@Transactional()
public interface MedecinRepository extends JpaRepository<Medecin, Long>{
	@Query("select i from Medecin i where i.login = :login  and i.password = :password and validation=1")
	public Medecin signinMedecin(@Param("login")String login,@Param("password")String password) ;

	@Query("select i from Medecin i where i.validation=1 ")
	public List<Medecin> getMedecinByValidation() ;
	
	@Query("select i from Medecin i where i.login = :login")
	public Medecin verifUsername(@Param("login")String login);

}
