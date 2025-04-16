package com.evolve.tech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {

    @PostMapping("/register")
    public String registerUser(@RequestParam String name, @RequestParam String contact, @RequestParam String email) {
        // Logic for saving user or sending emails can be added here.
        return "redirect:/success";
    }
}
