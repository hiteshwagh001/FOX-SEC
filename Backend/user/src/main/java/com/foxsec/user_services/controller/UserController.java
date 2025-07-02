package com.foxsec.user_services.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.foxsec.user_services.dto.ResponseDto;
import com.foxsec.user_services.dto.UserDto;
import com.foxsec.user_services.model.User;
import com.foxsec.user_services.services.servicesImpl.UserServicesImpl;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/api/users", produces = { MediaType.APPLICATION_JSON_VALUE })
@Validated
public class UserController {

    @Autowired
    private UserServicesImpl userServices;

    @GetMapping("check/user")
    public ResponseEntity<ResponseDto> getMethodName() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(new ResponseDto("200", "User service is running"));
    }

    @PostMapping("/addUser")
    public ResponseEntity<?> postMethodName(@Valid @RequestBody UserDto userDto) {
        // Here you would typically call a service to save the user details
        // For now, we will just return a dummy response
        userServices.saveUser(userDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ResponseDto("201", "User created successfully" +
                        " with username: " + userDto.getUsername() +
                        " and email: " + userDto.getEmail()));
    }

    @GetMapping("/getUsers")
    public ResponseEntity<List<User>> getUsers() {
        userServices.getAllUser();
        List<User> users = userServices.getAllUser().orElseThrow(() -> new RuntimeException("No users found"));
        return ResponseEntity.ok(users);
    }

    @GetMapping("/getUser")
    public ResponseEntity<UserDto> getUserByEmail(@RequestParam String email) {
        // Here you would typically call a service to get the user details by ID
        // For now, we will just return a dummy response
        UserDto userDto = userServices.getUserByEmail(email);
        return ResponseEntity.status(HttpStatus.OK).body(userDto);
    }
}