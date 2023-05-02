package com.example.docker.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class DockerProductController {
    @GetMapping("/products")
    public String getMessage() {
        return "A brand new product";
    }
}