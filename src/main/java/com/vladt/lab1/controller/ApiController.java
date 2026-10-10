package com.vladt.lab1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", defaultValue = "студент") String name) {
        return "Здравствуйте, " + name + "! Это первая лабораторная по РБПО.";
    }

    @GetMapping("/square")
    public int square(@RequestParam(name = "value", defaultValue = "0") int value) {
        return value * value;
    }
}
