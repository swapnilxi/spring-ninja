package com.swapnilxi.springsecuritycouponstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swapnilxi.springsecuritycouponstore.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
