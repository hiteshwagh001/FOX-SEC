package com.foxsec.ticket_services.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {

    private String id;
    private String name;
    private String description;
    private String status;
    private String type;
    private String priority;
    private String assignee;

    @CreatedDate
    private String createdAt;

    @LastModifiedBy
    private String updatedAt;
    
}
