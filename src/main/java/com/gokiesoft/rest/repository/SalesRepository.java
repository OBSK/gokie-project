package com.gokiesoft.rest.repository;

import com.gokiesoft.rest.model.Sales;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sales, Long> {
    
}