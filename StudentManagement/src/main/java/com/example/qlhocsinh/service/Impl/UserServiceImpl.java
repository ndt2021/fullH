package com.example.qlhocsinh.service.Impl;

import com.example.qlhocsinh.dtos.UserDto;
import com.example.qlhocsinh.models.User;
import com.example.qlhocsinh.reponsivetory.UserRepository;
import com.example.qlhocsinh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void create(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword( userDto.getPassword());
        userRepository.save(user);
    }

    public String getUserNameByEmail(String email){
        User user = userRepository.findUserByEmail(email);
        // Kiểm tra xem người dùng có tồn tại không
        if (user != null) {
            // Trả về tên của người dùng nếu tồn tại
            return user.getName();
        } else {
            // Trả về null hoặc một giá trị mặc định nếu người dùng không tồn tại
            return "nguoi dung khong ton tai";
        }
    }
    public String getUserPassByEmail(String email){
        User user = userRepository.findUserByEmail(email);
        if (user != null) {
            // Trả về tên của người dùng nếu tồn tại
            return user.getPassword();
        } else {
            // Trả về null hoặc một giá trị mặc định nếu người dùng không tồn tại
            return "nguoi dung khong ton tai";
        }
    }

    @Override
    public void deleteUserByEmail(String email) {
        // Gọi phương thức xóa người dùng từ repository
        User user = userRepository.findUserByEmail(email);
        if (user != null) {
            userRepository.delete(user);
        }

    }

    @Override
    public Boolean checkUserByEmail(String email) {
        User user = userRepository.findUserByEmail(email);
        if(user == null) return false;
        return true;
    }
    
}