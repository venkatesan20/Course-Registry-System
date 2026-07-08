package com.example.CourseRegistrationSystem.Respository;

import com.example.CourseRegistrationSystem.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailRepo extends JpaRepository<Users,Integer>{

    Users getByUsername(String username);
}
