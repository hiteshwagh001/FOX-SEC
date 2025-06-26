package com.foxsec.ticket_services.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.foxsec.ticket_services.model.Ticket;

public interface TicketRepo  extends MongoRepository<Ticket, String> {

    // Custom query methods can be defined here if needed
    // For example, to find tickets by status:
    // List<Ticket> findByStatus(String status);
    
}
