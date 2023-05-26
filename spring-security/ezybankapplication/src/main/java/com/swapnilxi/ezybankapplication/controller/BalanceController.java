package com.swapnilxi.ezybankapplication.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class BalanceController {
    @GetMapping(value="/mybalance")
    public String getBalance() {
        return "balance";
    }
        
}
