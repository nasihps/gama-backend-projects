package com.iiht.restjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.restjpa.entity.Product;
import com.iiht.restjpa.repository.ProductRepository;

@Service
public class ProductService {

	
	@Autowired
	ProductRepository productRepository;
	
	public Product save(Product product) {
		return productRepository.save(product);
	}
	
}
