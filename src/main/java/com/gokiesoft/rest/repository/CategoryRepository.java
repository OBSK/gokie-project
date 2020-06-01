package com.gokiesoft.rest.repository;

import com.gokiesoft.rest.model.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}