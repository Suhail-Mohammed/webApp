package com.example.webApp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        return "Welcome to the world of Suhail";

    }

    @RequestMapping("/about")
    public String about() {
        return "WE ARE HUMANS";
    }



    }

