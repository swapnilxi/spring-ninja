package com.swapnilxi.springsecuritycouponstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swapnilxi.springsecuritycouponstore.Entity.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
