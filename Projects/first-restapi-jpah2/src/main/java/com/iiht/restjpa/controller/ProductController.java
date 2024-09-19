package com.iiht.restjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.restjpa.entity.Product;
import com.iiht.restjpa.service.ProductService;

@RestController
@RequestMapping("/product/api.1.0")
public class ProductController {

	@Autowired
	ProductService service;
	
	@PostMapping
	@RequestMapping(path = "/create",
	    consumes= MediaType.APPLICATION_JSON_VALUE,
	        produces= MediaType.APPLICATION_JSON_VALUE
	)
	public ResponseEntity<Product> createProduct(@RequestBody Product productReq){
		
		
		System.out.println(productReq);
		/* Product newProduct = service.save(productReq); */
		//return new ResponseEntity<Product>(service.save(productReq), HttpStatus.CREATED);
		return ResponseEntity.ok(service.save(productReq));
		
	}
}
