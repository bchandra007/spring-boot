package com.auto.spring_practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auto.spring_practice.model.Product;


@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {


    
}