package ru.appmodel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SimpleController {
    @GetMapping("/test")
    public String testResponse() {
        return "Hello world";
    }
}
