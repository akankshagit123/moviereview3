package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resources;

@RestController
public class ReviewController {


    @GetMapping(value = "/message")
    public String getMessage() {
        return "hello world";
    }

    @GetMapping(value = "/message/{name}")
    public String anotherMessage(@PathVariable("name") String name){
        return "Hello"+name;
    }
}
