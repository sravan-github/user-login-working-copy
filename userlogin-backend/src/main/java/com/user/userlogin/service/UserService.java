package com.user.userlogin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.userlogin.model.User;
import com.user.userlogin.repo.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
        
    }

}
