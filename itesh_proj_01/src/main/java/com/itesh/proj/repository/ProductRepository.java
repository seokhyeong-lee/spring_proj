package com.itesh.proj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itesh.proj.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
