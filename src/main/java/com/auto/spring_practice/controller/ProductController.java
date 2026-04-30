package com.auto.spring_practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.auto.spring_practice.model.Product;
import com.auto.spring_practice.service.ProductService;



@RestController
public class ProductController {
    

    @Autowired
    private ProductService service;
   
    @GetMapping("/products")
    public String getProduct() {
        return service.getProducts().toString();
    }

     @GetMapping("/products/{productId}")
    public String getProductById(@PathVariable int productId) {
        return service.getProductById(productId).toString();
    }


  @PostMapping( "/products ")
    public void addProduct(@RequestBody Product product) {
    service.addProduct(product);
}

  @PutMapping("/products")
  public void updateProduct(@RequestBody Product updatedProduct) {
       service.updateProduct(updatedProduct);
  }


  @DeleteMapping("/products/ {id}")
  public void deleteProduct(@PathVariable int id) {
       service.deleteProduct(id);
  }
  
}
