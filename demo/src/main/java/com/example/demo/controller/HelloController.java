package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //Marks this class as REST controller

public class HelloController {

    @GetMapping("/hello") //Maps HTTP GET requests to /hello
    public String sayHello(){
        return "Hello, spring boot API! ";

    }
}
