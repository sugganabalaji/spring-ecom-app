package com.app.controller.repository.service;

import com.app.controller.repository.ProductRepository;
import com.app.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(int id) {
        return repository.findById(id).orElseGet(() -> null);
    }
}
