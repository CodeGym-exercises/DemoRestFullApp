package com.example.demo.service;


import com.example.demo.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAllProduct();
    Optional<Product> findById(Integer id);
    void save(Product product);
    void remove(Product product);
}
