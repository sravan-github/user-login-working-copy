package com.user.userlogin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.userlogin.model.User;
import com.user.userlogin.service.UserService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping
    public User createUser(@RequestBody User user) {
        User savedUser = userService.saveUser(user);

        System.out.println("User saved ::------------"+savedUser);
        System.out.println("User saved ::------------"+user);
        return savedUser;
        }

    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

}
