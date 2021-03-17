package com.example.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springjpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
