package com.swapnilxi.springsecurity.controller;

import org.springframework.stereotype.Controller;

@RestController
public class Hellocontroller {
    @GetMapping("/hello")
    public static String welcome() {
        System.out.println("welcome to spring boot ");
        return "welcome to spring boot";
        
    }
}
