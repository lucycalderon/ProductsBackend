package com.example.products.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.products.demo.model.Product;


public interface ProductRepository extends JpaRepository<Product,Integer> {
    
}
