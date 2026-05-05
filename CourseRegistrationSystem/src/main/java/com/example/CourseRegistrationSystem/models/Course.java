package com.example.CourseRegistrationSystem.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@Data
public class Course {
    @Id
    private String CourseId;
    private String CourseName;

    public Course() {
    }

    private String Trainer;

    public Course(String courseId, String trainer, String courseName, String duration, int fees) {
        CourseId = courseId;
        Trainer = trainer;
        CourseName = courseName;
        Duration = duration;
        Fees = fees;
    }

    private String Duration;
    private int Fees;
}
