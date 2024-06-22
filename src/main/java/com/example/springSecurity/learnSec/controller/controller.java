package com.example.springSecurity.learnSec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Guest";
    }

    @GetMapping("/")
    public String guest(){
        return "you are always welcome";
    }
    @GetMapping("/user")
    public String user(){
        return "you are the USER welcome";
    }
    @GetMapping("/admin")
    public String admin(){
        return "you are the admin welcome";
    }



}
