package com.swapnilxi.ezybankapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
    @GetMapping(value="/myloans")
    public String getLoans() {
        return "loans";
    }
}
