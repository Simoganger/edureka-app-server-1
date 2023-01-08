package com.simontech.edurekaappserver1.service;

import com.simontech.edurekaappserver1.model.Product;
import com.simontech.edurekaappserver1.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService (ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public Product createProduct(final Product product){
        return productRepository.save(product);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
