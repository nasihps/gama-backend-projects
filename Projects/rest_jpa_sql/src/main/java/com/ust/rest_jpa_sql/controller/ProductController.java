package com.ust.rest_jpa_sql.controller;

import com.ust.rest_jpa_sql.model.Product;
import com.ust.rest_jpa_sql.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.observation.ObservationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    @Autowired
    public ProductService productService;



    @PostMapping
    @RequestMapping(path = "/create",
        consumes= MediaType.APPLICATION_JSON_VALUE,
            produces= MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Product> addProductViaController(@RequestBody Product product){
        return ResponseEntity.ok(productService.addProduct(product));
    }

    @GetMapping("/fetchAll")
    public ResponseEntity<?> fetchAll() {
        return ResponseEntity.status(HttpStatus.OK).body(productService.fetchAll());
    }

    @PostMapping("/deleteById/{id}")
    public void delete(@PathVariable Long id){
        productService.deleteById(id);
        ResponseEntity.status(HttpStatus.OK);
    }

}
