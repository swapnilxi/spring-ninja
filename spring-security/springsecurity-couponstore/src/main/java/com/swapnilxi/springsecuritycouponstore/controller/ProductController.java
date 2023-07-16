package com.swapnilxi.springsecuritycouponstore.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ProductController {
    @GetMapping(value="/product")
    public String getProduct() {
        return "product";
    }

    @GetMapping(value="/cart")
    public String getCart() {
        return "Cart";
    }
    
    
}
