package com.foxsec.user_services.model;

public enum UserRole {
    ADMIN,
    USER,
    GUEST;

    public static UserRole fromString(String role) {
        try {
            return UserRole.valueOf(role.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid user role: " + role);
        }
    }
}
