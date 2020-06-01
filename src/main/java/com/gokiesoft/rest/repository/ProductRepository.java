package com.gokiesoft.rest.repository;

import com.gokiesoft.rest.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}