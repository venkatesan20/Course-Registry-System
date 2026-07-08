package com.example.CourseRegistrationSystem.service;

import com.example.CourseRegistrationSystem.models.UserPrincipal;
import com.example.CourseRegistrationSystem.models.Users;
import com.example.CourseRegistrationSystem.Respository.UserDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyuserDetailsService implements UserDetailsService {

    @Autowired
    UserDetailRepo Repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       Users user = Repo.getByUsername(username);
       if(user == null){
           throw  new UsernameNotFoundException("User Not found");
       }
       return new UserPrincipal(user);
    }
}
