package com.example.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello";
    }

    @GetMapping("/get")
    @ResponseBody
    public String get() {
        return "Get";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post() {
        return "Post";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put() {
        return "Put";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete() {
        return "Delete";
    }
}
