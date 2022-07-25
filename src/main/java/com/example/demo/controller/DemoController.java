package com.example.demo.controller;

import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @Autowired
    private DemoService demoService;
    @GetMapping(value = "/test")
    public String hello(String name){
        return "Hello"+demoService.print(name);
    }
}
