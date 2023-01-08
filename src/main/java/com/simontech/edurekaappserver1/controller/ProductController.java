package com.simontech.edurekaappserver1.controller;

import com.simontech.edurekaappserver1.model.Product;
import com.simontech.edurekaappserver1.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    private ProductService productService;

    public ProductController (ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts(){
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }

    @PostMapping("/product")
    public ResponseEntity<Product> createProductApi(@RequestBody Product product){
        return new ResponseEntity<>(productService.createProduct(product), HttpStatus.CREATED);
    }
}
