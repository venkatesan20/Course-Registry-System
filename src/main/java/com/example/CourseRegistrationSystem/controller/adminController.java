package com.example.CourseRegistrationSystem.controller;
import com.example.CourseRegistrationSystem.models.CourseRegistery;
import com.example.CourseRegistrationSystem.models.Users;
import com.example.CourseRegistrationSystem.service.CourseService;
import com.example.CourseRegistrationSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/admin")
public class adminController {

    @Autowired
    UserService userService;

    @Autowired
    CourseService service;

    @PostMapping("/add-user")
    public  void addusers(@RequestBody Users user){
        userService.addusers(user);
    }
    @GetMapping("/entroll-users")
    public List<CourseRegistery> EntrollCourse(){
        return service.EntrollCourse();
    }
}
