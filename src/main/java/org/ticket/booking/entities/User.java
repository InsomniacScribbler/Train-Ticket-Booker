package org.ticket.booking.entities;

import java.util.List;

public class User {
    private String name;
    private String UUID;
    private String password;
    private String hashPasswords;
    private List<Ticket> ticketsBooked;
}
