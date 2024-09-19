package com.ust.rest_jpa_sql.service;

import com.ust.rest_jpa_sql.model.Product;
import com.ust.rest_jpa_sql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    public ProductRepository productRepository;

    public List<Product> fetchAll() {
        return productRepository.findAll();
    }

    public void deleteById(long id) {
        productRepository.deleteById(id);
    }

    public Product addProduct(Product product){
        return productRepository.save(product);
    }
}
