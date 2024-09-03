package com.example.sanjaykumar777.spring_e_commerce.repository;

import com.example.sanjaykumar777.spring_e_commerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
