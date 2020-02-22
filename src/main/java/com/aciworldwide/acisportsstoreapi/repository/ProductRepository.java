package com.aciworldwide.acisportsstoreapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aciworldwide.acisportsstoreapi.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
