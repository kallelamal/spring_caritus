package com.cartus.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cartus.entities.Administrateur;

@Transactional()
public interface AdministrateurRepository extends JpaRepository<Administrateur, Long> {
	@Query("select i from Administrateur i where i.login = :login  and i.password = :password")
	public Administrateur signinAdministrateur(@Param("login") String login, @Param("password") String password);

	@Modifying
	@Query("update Medecin i SET i.validation= 1 WHERE i.id =:id")
	public Integer acceptermedecin(@Param("id") Long id);
}
