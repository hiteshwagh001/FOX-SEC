package com.foxsec.user_services.services.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foxsec.user_services.dto.UserDto;
import com.foxsec.user_services.model.User;
import com.foxsec.user_services.model.UserRole;
import com.foxsec.user_services.repo.UserRepo;
import com.foxsec.user_services.services.UserServices;

@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    private UserRepo userRepo;

    // Implement the methods defined in UserServices interface
    @Override
    public Optional<User> saveUser(UserDto userDto) {
        // Logic to save user
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
        user.setRole(UserRole.fromString(userDto.getRole()));
        user.setActive(true); // Assuming new users are active by default
        user.setCreatedAt(String.valueOf(System.currentTimeMillis())); // Placeholder for createdAt
        user.setUpdatedAt(String.valueOf(System.currentTimeMillis())); // Placeholder for updatedAt
        // Save the user to the repository
        return Optional.of(userRepo.save(user));
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
