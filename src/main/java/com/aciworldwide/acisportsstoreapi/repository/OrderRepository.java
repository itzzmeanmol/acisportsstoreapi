package com.aciworldwide.acisportsstoreapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aciworldwide.acisportsstoreapi.model.Order;
import com.aciworldwide.acisportsstoreapi.model.Product;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
