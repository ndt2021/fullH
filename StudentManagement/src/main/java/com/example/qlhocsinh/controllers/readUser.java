package com.example.qlhocsinh.controllers;

import com.example.qlhocsinh.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class readUser {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String showUsers(Model model) {

        model.addAttribute("name", userService.getUserNameByEmail("nguyenductu2002tu@gmail.com") );

        model.addAttribute("password", userService.getUserPassByEmail("nguyenductu2002tu@gmail.com"));
        return "userpage";
    }


}
