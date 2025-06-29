package com.foxsec.user_services.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.foxsec.user_services.dto.UserDto;
import com.foxsec.user_services.model.User;

@Service
public interface UserServices {
    
    public Optional<User> saveUser(UserDto user);

    public Optional<User> getUserById(String id);

    public Optional<User> updateUser(User user);

    boolean deleteUser(String id);

    boolean isUserExist(String id);

    boolean isUserExistByEmail(String email);

    Optional<List<User>> getAllUser();
    
}
