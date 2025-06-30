package com.foxsec.user_services.dto;

import lombok.Data;

@Data
public class UserDto {

    private String username;
    private String password;
    private String email;
    private String role;
    private boolean active; // Indicates if the user account is active or not
    private String createdAt; // Placeholder for createdAt
    private String createdBy; // Placeholder for createdBy
    private String updatedAt; // Placeholder for updatedAt
    
}
