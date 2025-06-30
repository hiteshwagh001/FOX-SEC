package com.foxsec.user_services.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {

    private String id;
    private String username;
    private String password;

    private String email;
    private UserRole role; // e.g., "admin", "user", etc.
    private boolean active; // Indicates if the user account is active or not

    @CreatedDate
    private String createdAt;
    
    private String createdBy;

    @LastModifiedBy
    private String updatedAt;

}
