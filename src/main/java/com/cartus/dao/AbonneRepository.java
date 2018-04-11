package com.cartus.dao;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.cartus.entities.Abonne;

@Transactional()
public interface AbonneRepository extends JpaRepository<Abonne, Long>{
	@Query("select i from Abonne i where i.login like :login  and i.password like :password")
	public Abonne signinAbonne(@Param("login")String login,@Param("password")String password) ;
	@Query("select i from Abonne i where i.login like :login")
	public Abonne verifUsername(@Param("login")String login);
}
