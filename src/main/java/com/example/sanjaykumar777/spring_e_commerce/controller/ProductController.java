package com.example.sanjaykumar777.spring_e_commerce.controller;

import com.example.sanjaykumar777.spring_e_commerce.model.Product;
import com.example.sanjaykumar777.spring_e_commerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;
    @RequestMapping("/products")
    public List<Product> getAllProducts(){
        return service.getProducts();
    }
}
