package com.swapnilxi.ezybankapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @GetMapping(value="/mycontact ")
    public String getContact() {
        return "my contact";
    }
}
