package com.example.qlhocsinh.controllers;

import com.example.qlhocsinh.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReadUser {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String showUsers() {
        return "searchuser";
    }
    @PostMapping("/users")
    public String searchUser(@RequestParam("email") String email, Model model) {
        String name = userService.getUserNameByEmail(email);
        String password = userService.getUserPassByEmail(email);

        model.addAttribute("name", name);
        model.addAttribute("password", password);
        return "userpage";
    }


}
