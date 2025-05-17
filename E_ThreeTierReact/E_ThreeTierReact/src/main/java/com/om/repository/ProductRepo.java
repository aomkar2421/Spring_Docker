package com.om.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.om.Entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
