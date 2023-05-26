package com.swapnilxi.ezybankapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {
    @GetMapping(value="/mycards")
    public String getCards() {
        return "my cards";
    }
    
    
}
