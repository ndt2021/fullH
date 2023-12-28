package com.example.qlhocsinh.controllers;

import com.example.qlhocsinh.dtos.UserDto;
import com.example.qlhocsinh.models.User;
import com.example.qlhocsinh.service.AuthService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("auth")
public class AuthController {
    AuthService authService;

    @GetMapping("/register")
    public String viewRegister(Model model){
        model.addAttribute("userdata", new UserDto());
        return "registerpage";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute("userdata") UserDto userDto, Model model){
        try {
            authService.register(userDto);
            return "redirect:/auth/register";
        } catch (RuntimeException e) {
            model.addAttribute("error", e.getMessage());
            return "redirect:/auth/register";
        }
    }



}
