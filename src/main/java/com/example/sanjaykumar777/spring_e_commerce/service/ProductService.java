package com.example.sanjaykumar777.spring_e_commerce.service;

import com.example.sanjaykumar777.spring_e_commerce.model.Product;
import com.example.sanjaykumar777.spring_e_commerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;
//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101,"Iphone",50000),
//            new Product(102,"Canon camera",70000),
//            new Product(103,"Shure mic",10000)
//
//    ));
    public List<Product> getProducts(){
//        return products;
        return productRepository.findAll();
    }

    public Product getProductById(int prodId){
//        return products.stream().filter(p -> p.getProdId() == prodId)
//                .findFirst().orElse(new Product(100,"No item",0));
        return productRepository.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product product){
//        products.add(product);
        productRepository.save(product);
    }

    public void updateProduct(Product product){
//        int index =0;
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProdId() == product.getProdId()){
//                index =i;
//            }
//        }
//        products.set(index,product);
        productRepository.save(product);
    }

    public void deleteProduct(int prodId){
//        int index =0;
//        for(int i=0;i<products.size();i++){
//            if(products.get(i).getProdId() == prodId){
//                index = i;
//            }
//        }
//        products.remove(index);
        productRepository.deleteById(prodId);
    }
}
