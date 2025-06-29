package com.foxsec.user_services.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foxsec.user_services.dto.UserDto;
import com.foxsec.user_services.model.User;
import com.foxsec.user_services.services.UserServices;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserServices userServices;

    @GetMapping("check/user")
    public String getMethodName() {

        return "hey there, you sent: user";
    }

    @GetMapping("/getUsers")
    public ResponseEntity<List<User>> getUsers() {
        // Here you would typically call a service to get the user details
        // For now, we will just return a dummy response
        userServices.getAllUser();
        List<User> users = userServices.getAllUser().orElseThrow(() -> new RuntimeException("No users found"));
        return ResponseEntity.ok(users);

    }

    @PostMapping("/addUser")
    public ResponseEntity<?> postMethodName(@RequestBody UserDto userDto) {
        // Here you would typically call a service to save the user details
        // For now, we will just return a dummy response
        Optional<User> user = userServices.saveUser(userDto);
        return ResponseEntity.ok(user);

    }

}
