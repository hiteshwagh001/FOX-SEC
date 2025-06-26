package com.foxsec.ticket_services.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/tickets")
public class TicketController {
    

    @GetMapping("check")
    public String getMethodName() {
        return "hey there, you sent: ticket " ;
    }
    
}