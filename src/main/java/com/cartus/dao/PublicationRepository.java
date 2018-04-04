package com.cartus.dao;
import java.util.List;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cartus.entities.Abonne;
import com.cartus.entities.Medecin;
import com.cartus.entities.Publication;

@Transactional()
public interface PublicationRepository extends JpaRepository<Publication,Long> {

	@Query("select i from Medecin i where i.specialite = :specialite")
	public Medecin getPublicationByspecialite(@Param("specialite")String specialite) ;

	

}
