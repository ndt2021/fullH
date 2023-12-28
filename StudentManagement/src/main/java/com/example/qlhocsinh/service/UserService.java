package com.example.qlhocsinh.service;



import com.example.qlhocsinh.dtos.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void save(UserDto userDto);

    Boolean checkUserByEmail(String email);

    public String getUserNameByEmail(String email);
    public String getUserPassByEmail(String email);

    void deleteUserByEmail(String email);

}
