package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resources;

@RestController
public class ReviewController {


    @GetMapping(value = "/message")
    public String getMessage() {
        return "hello world";
    }
}
