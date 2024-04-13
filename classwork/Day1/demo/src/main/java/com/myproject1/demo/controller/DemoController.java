package com.myproject1.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/demo")
public class DemoController {
    @GetMapping("/abc")
    public String getMethodName()
    {
        return "Hello";
    }
}
