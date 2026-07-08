package com.example.CourseRegistrationSystem.service;

import com.example.CourseRegistrationSystem.models.Users;
import com.example.CourseRegistrationSystem.Respository.UserDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);

    @Autowired
    UserDetailRepo userDetailRepo;

    public void addusers(Users user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
       userDetailRepo.save(user);
    }
}
