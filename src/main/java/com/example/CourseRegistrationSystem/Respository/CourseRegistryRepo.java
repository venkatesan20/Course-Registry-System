package com.example.CourseRegistrationSystem.Respository;

import com.example.CourseRegistrationSystem.models.CourseRegistery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistryRepo extends JpaRepository<CourseRegistery,Integer> {
}
