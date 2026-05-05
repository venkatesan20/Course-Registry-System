package com.example.CourseRegistrationSystem.service;

import com.example.CourseRegistrationSystem.Respository.CourseRegistryRepo;
import com.example.CourseRegistrationSystem.Respository.CourseRepo;
import com.example.CourseRegistrationSystem.models.Course;
import com.example.CourseRegistrationSystem.models.CourseRegistery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;

    @Autowired
    CourseRegistryRepo courseRegistryRepo;

    public List<Course> avalablecourse() {
      return courseRepo.findAll();
    }

    public List<CourseRegistery> entrollCourse() {
        return courseRegistryRepo.findAll();
    }

    public void courseregistration(String name, String emailid, String coursename) {
        CourseRegistery courseRegistery =new CourseRegistery(name,emailid,coursename);
        courseRegistryRepo.save(courseRegistery);
    }
}
