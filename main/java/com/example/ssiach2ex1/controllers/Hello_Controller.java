package com.example.ssiach2ex1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello_Controller {
    @GetMapping("/hello")
    public String hello(){
        return "Hello Security!\n";
    }
    @GetMappin("/hi")
    public String hi(){
        return "Hi evryone";
}
