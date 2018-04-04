package com.cartus.dao;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cartus.entities.Abonne;
import com.cartus.entities.Publication;

@Transactional()
public interface publicationRepository extends JpaRepository<Publication,Long> {
	/*@Query("select i from publication i where i.id = :id")
	public publication affichepublication(@Param("id")String id);*/

}
