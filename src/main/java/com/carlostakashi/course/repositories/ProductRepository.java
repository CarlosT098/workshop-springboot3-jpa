package com.carlostakashi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlostakashi.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
