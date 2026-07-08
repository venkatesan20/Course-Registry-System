package com.example.CourseRegistrationSystem.Respository;

import com.example.CourseRegistrationSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course,String> {
}
