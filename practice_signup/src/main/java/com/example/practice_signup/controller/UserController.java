package com.example.practice_signup.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, User!";
    }

    @PostMapping("/join")
    public String join(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    

}
