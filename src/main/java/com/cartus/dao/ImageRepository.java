package com.cartus.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cartus.entities.ImageModel;
public interface ImageRepository extends JpaRepository<ImageModel, Long>{
}