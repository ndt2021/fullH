package com.example.qlhocsinh.controllers;

import com.example.qlhocsinh.dtos.UserDto;

import com.example.qlhocsinh.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@AllArgsConstructor
public class registerUser {
    @Autowired
    private UserService userService;
    @ModelAttribute("userdto")
    public UserDto userRegistationDto(){
        return new UserDto();
    }

    @GetMapping("/register")
    public String showFormRegister(){
        return "register-user";
    }

    @PostMapping("/register")
    public  String registrationUser(@ModelAttribute("userdata") UserDto userDto){

        if(userService.checkUserByEmail(userDto.getEmail())){
            return "redirect:/register?emailexist";
        }
        if(userDto.getPassword().equals(userDto.getConfirmPass()) == false){
            return "redirect:/register?checkpass";
        }
        userService.save(userDto);
        return "redirect:/register?success";
    }
}
