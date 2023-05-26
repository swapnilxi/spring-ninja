package com.swapnilxi.ezybankapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {
    @GetMapping(value="/myNotices")
    public String getBalance() {
        return "Notices";
    }
    
}
