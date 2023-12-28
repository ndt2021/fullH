package com.example.qlhocsinh.service;

import com.example.qlhocsinh.dtos.UserDto;
import com.example.qlhocsinh.models.User;

public interface AuthService {

    void register(UserDto userDto);
}
