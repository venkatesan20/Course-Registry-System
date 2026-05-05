package com.example.CourseRegistrationSystem.controller;

import com.example.CourseRegistrationSystem.models.Course;
import com.example.CourseRegistrationSystem.models.CourseRegistery;
import com.example.CourseRegistrationSystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
@CrossOrigin(origins = "http://127.0.0.1:5500/")
public class CourseController {

    @Autowired
    CourseService service;


    @GetMapping("")
    public List<Course> Avaliablecourse(){
        return service.avalablecourse();
    }

    @GetMapping("/entroll")
    public List<CourseRegistery> EntrollCourse(){
        return service.entrollCourse();
    }
    @PostMapping("/register")
    public String Courseregister(@RequestParam("Name") String name,
                                 @RequestParam("EmailId") String emailid,
                                @RequestParam("CourseName") String coursename ){
         service.courseregistration(name,emailid,coursename);
         return "Congratulations! "+ " "+name+"Entrollment is Successful For "+coursename;

    }


}
