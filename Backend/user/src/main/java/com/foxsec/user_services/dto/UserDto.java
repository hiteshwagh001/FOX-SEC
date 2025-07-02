package com.foxsec.user_services.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDto {

    private String userId; // Unique identifier for the user

    @NotEmpty(message = "Username cannot be empty")
    @Size(min = 3, max = 20, message = "Username must be between 3 and 20 characters")
    private String username;

    private String password;

    @NotEmpty(message = "Email cannot be empty")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", message = "Invalid email format")
    private String email;
    private String role;
    private boolean active; // Indicates if the user account is active or not
    private String createdAt; // Placeholder for createdAt
    private String createdBy; // Placeholder for createdBy
    private String updatedAt; // Placeholder for updatedAt

}
