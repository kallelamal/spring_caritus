package com.cartus.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cartus.entities.Medecin;

@Transactional()
public interface MedecinRepository extends JpaRepository<Medecin, Long>{
	@Query("select i from Medecin i where i.login like :login  and i.password like :password")
	public Medecin signinMedecin(@Param("login")String login,@Param("password")String password) ;

	@Query("select i from Medecin i where i.validation= :validation ")
	public List<Medecin> getMedecinByValidation(@Param("validation")int validation) ;

}
