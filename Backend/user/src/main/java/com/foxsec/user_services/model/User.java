package com.foxsec.user_services.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String id;
    private String username;
    private String password;
    private String email;
    private String role; // e.g., "admin", "user", etc.
    private boolean active; // Indicates if the user account is active or not

    @CreatedDate
    private String createdAt;

    @LastModifiedBy
    private String updatedAt;

}
