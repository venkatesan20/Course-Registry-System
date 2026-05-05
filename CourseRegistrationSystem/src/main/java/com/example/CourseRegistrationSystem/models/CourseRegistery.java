package com.example.CourseRegistrationSystem.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CourseRegistery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;//auto Increment

    private String Name;
    private String EmailId ;

    public CourseRegistery(String name, String emailId, String courseName) {
        Name = name;
        EmailId = emailId;
        CourseName = courseName;
    }

    private String CourseName;
}
