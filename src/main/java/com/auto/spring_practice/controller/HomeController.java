package com.auto.spring_practice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
    
    @RequestMapping("/")
    public String greet() {
        return "Hello, Spring!!!!";
    }

     @RequestMapping("/about")
    public String about() {
        return "this is spring practice project";
    }
}
