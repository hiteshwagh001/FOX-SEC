package com.foxsec.user_services.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.foxsec.user_services.model.User;

@Repository
public interface UserRepo extends MongoRepository<User, String> {

    // Custom query methods can be defined here if needed
    // For example, to find users by username:
    // User findByUsername(String username);

    // To find a user by email
    Optional<User> findByEmail(String email);
    
}
