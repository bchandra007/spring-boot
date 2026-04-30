package com.auto.spring_practice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class LoginController {

     @RequestMapping("/login")
    public String greet() {
        return "login page is loading...";
    }

}
