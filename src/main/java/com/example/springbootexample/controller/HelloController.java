package com.example.springbootexample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/test")
    public String Hello(){
        return "Hello Spring World ";
    }
}
