	package com.cartus.dao;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cartus.entities.Reponse;


@Transactional()
public interface ReponseRepository extends JpaRepository<Reponse, Long> {

}
