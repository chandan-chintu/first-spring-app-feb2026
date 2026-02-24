package com.firstspringboot.example.first_spring_app_feb2026.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample/apis")
public class SampleController {

    @GetMapping("/sample1")
    public String getSample1(){
        System.out.println("This is our first sample API! - printing in console");
        return "This is our first sample API!- returning to user";
    }

    @GetMapping("/sample2")
    public String getSample2(){
        System.out.println("This is our second sample API! - printing in console");
        return "This is our second sample API!- returning to user";
    }
}
