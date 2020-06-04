package com.gokiesoft.rest.repository;

import com.gokiesoft.rest.model.SaleItem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleItemRepository extends JpaRepository<SaleItem, Long> {
    
}