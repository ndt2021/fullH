package com.example.qlhocsinh.controllers;

import com.example.qlhocsinh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class deleteUser {
    @Autowired
    private UserService userService;

    @GetMapping("deleteuser")
    public String showFormDelete(){
        return "deletepage";
    }

    @DeleteMapping("deleteuser")
    public String deleteUser(@RequestParam("email") String email) {
        // Gọi phương thức xóa người dùng từ service
        userService.deleteUserByEmail(email);
        // Redirect hoặc chuyển hướng sau khi xử lý thành công
        return "fix";
    }

}
