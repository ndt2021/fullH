package com.example.qlhocsinh.reponsivetory;

import com.example.qlhocsinh.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
public interface UserRepository extends JpaRepository<User, UUID> {
    User findUserByEmail(String email);

    // Thêm phương thức xóa người dùng theo email và mật khẩu
    void deleteByEmailAndPassword(String email, String password);

}

