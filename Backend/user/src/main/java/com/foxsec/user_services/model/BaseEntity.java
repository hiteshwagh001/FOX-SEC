package com.foxsec.user_services.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity {

    private String id; // Unique identifier for the entity
    private LocalDateTime createdAt; // Timestamp when the entity was created
    private LocalDateTime updatedAt; // Timestamp when the entity was last updated
    private String createdBy; // User who created the entity
    private String updatedBy; // User who last updated the entity

    // Additional common fields can be added here as needed

}