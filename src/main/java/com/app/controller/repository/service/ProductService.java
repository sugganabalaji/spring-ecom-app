package com.app.controller.repository.service;

import com.app.controller.repository.ProductRepository;
import com.app.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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

    public Product saveOrUpdate(Product product, MultipartFile imageFile) throws IOException {
        if (imageFile == null) {
            return null;
        }
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageData(imageFile.getBytes());
        return repository.save(product);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
