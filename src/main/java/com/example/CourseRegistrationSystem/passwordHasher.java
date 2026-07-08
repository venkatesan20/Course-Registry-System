package com.example.CourseRegistrationSystem;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class passwordHasher {
   public static void main(String[] args) {

       BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);
       String pt ="venkat@2003";
       String hashedPassword = passwordEncoder.encode(pt);
       System.out.print(hashedPassword+":");
    }
}
