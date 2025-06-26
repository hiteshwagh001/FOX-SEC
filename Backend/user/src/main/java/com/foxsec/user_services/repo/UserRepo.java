package com.foxsec.user_services.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.foxsec.user_services.model.User;

public interface UserRepo extends MongoRepository<User, String> {

    // Custom query methods can be defined here if needed
    // For example, to find users by username:
    // User findByUsername(String username);
    
}
