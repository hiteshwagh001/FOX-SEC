package com.foxsec.user_services.services.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foxsec.user_services.dto.UserDto;
import com.foxsec.user_services.exception.UserAlreadyExistException;
import com.foxsec.user_services.mapper.UserMapper;
import com.foxsec.user_services.model.User;
import com.foxsec.user_services.repo.UserRepo;
import com.foxsec.user_services.services.UserServices;

@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    private UserRepo userRepo;

    // Implement the methods defined in UserServices interface
    @Override
    public void saveUser(UserDto userDto) {
        // Logic to save user
        User user = UserMapper.mapToUser(userDto);
        Optional<User> existingUser = userRepo.findByEmail(user.getEmail());
        if (existingUser.isPresent()) {
            // User with this email already exists
            throw new UserAlreadyExistException("User with email " + user.getEmail() + " already exists");
        }
        User savedUser = userRepo.save(user);
        return;
    }

    @Override
    public Optional<User> getUserById(String id) {
        // Logic to get user by ID
        return Optional.empty(); // Placeholder return
    }

    @Override
    public Optional<User> updateUser(User user) {
        // Logic to update user
        return Optional.empty(); // Placeholder return
    }

    @Override
    public boolean deleteUser(String id) {
        // Logic to delete user
        return false; // Placeholder return
    }

    @Override
    public boolean isUserExist(String id) {
        // Logic to check if user exists by ID
        return false; // Placeholder return
    }

    @Override
    public boolean isUserExistByEmail(String email) {
        // Logic to check if user exists by email
        return false; // Placeholder return
    }

    @Override
    public Optional<List<User>> getAllUser() {
        Optional<List<User>> users = Optional.of(userRepo.findAll());

        return users.isPresent() ? Optional.of(users.get()) : Optional.empty();
    }

}
