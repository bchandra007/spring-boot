package com.auto.spring_practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auto.spring_practice.model.Product;
import com.auto.spring_practice.repository.ProductRepo;


@Service
public class ProductService {


     @Autowired
     ProductRepo repo;



    // List<Product> products = new ArrayList<>(Arrays.asList(
    //     new Product(1, "Product A", 10),
    //     new Product(2, "Product B", 19),
    //     new Product(3, "Product C", 99)
    // ));


    public List<Product> getProducts() {
         return repo.findAll();
    }

      public Product getProductById(int id) {
        return repo.findById(id).orElse(new Product(100, "Product not found", 0));
    }

    // public List<Product> getProducts() {
    //      return products;
    // }

    //   public Product getProductById(int id) {
    //     return  products.stream()
    //    .filter(p -> p.getProdId() == id)
    //    .findFirst()
    //    .orElse(new Product(100, "Product not found", 0));
    // }

   public void addProduct(Product product) {
    getProducts().add(product);
}

    public void updateProduct(Product prod) {
        for (int i = 0; i < getProducts().size(); i++) {
            if (getProducts().get(i).getProdId() == prod.getProdId()) {
                getProducts().set(i, prod);
            }
        }
    }



   public void deleteProduct(int id) {
    int index=0;
   for (int i = 0; i < getProducts().size(); i++) {
        if (getProducts().get(i).getProdId() == id) {
           index=i;
        }
    }
    getProducts().remove(index);
}

}