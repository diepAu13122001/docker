package com.example.docker.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class DockerMessageController {
    @GetMapping("/messages")
    public String getMessage() {
        return "Hello from Docker!";
    }
}