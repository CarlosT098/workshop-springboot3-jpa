package com.carlostakashi.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlostakashi.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
