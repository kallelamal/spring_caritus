package com.cartus.dao;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cartus.entities.Reponse;


@Transactional()
public interface reponseRepository extends JpaRepository<Reponse, Long> {

}
