package com.evolve.tech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/about-us")
    public String aboutUs() {
        return "about";
    }

    @GetMapping("/courses")
    public String courses() {
        return "courses";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/success")
    public String success() {
        return "success";
    }
}
