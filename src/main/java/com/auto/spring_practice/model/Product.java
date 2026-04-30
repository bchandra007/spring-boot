package com.auto.spring_practice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Data
@AllArgsConstructor
public class Product {
    
    @Id
    private int prodId;
    private String prodName;
    private int price;

  
}