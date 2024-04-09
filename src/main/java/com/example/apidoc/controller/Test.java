package com.example.apidoc.controller;

import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Test {
    
    @GetMapping("Test")
    @Tag(description = "This api used as something", name = "Something")
    public String getMethodName(@RequestParam String param) {
        return new String("Hello");
    }
}
