package com.example.qlhocsinh.service.Impl;

import com.example.qlhocsinh.dtos.UserDto;
import com.example.qlhocsinh.models.User;
import com.example.qlhocsinh.service.AuthService;
import com.example.qlhocsinh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    private UserService userService;
    private String encodeString(String pass){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.encode(pass);
    }
    public void register(UserDto userDto){
        if(userService.checkUserByEmail(userDto.getEmail())){
               throw new RuntimeException("email da ton tai");
        }
        userDto.setPassword(this.encodeString(userDto.getPassword()));
        userService.create(userDto);

    }

}
