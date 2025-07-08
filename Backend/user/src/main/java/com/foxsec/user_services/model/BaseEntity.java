package com.foxsec.user_services.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;


@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity {

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @CreatedDate
    private LocalDateTime createdAt; // Timestamp when the entity was created

    @LastModifiedDate
    private LocalDateTime updatedAt; // Timestamp when the entity was last updated

    @CreatedBy
    private String createdBy; // User who created the entity

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @LastModifiedBy
    private String updatedBy; // User who last updated the entity

    // Additional common fields can be added here as needed

}