package com.example.demo.controller;

import com.example.demo.serivce.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class DemoController {

    @Autowired
    private BasicService basicService;

    @GetMapping("")
    public String landingPage() {
        return "This is landing page";
    }

    @GetMapping("/hello")
    public String hello() {
        return basicService.hello();
    }
}
