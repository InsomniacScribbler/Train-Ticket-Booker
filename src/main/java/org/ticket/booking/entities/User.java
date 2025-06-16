package org.ticket.booking.entities;

import java.util.List;

public class User {
    private String name;
    private String UUID;
    private String password;
    private String hashPasswords;
    private List<Ticket> ticketsBooked;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHashPasswords() {
        return hashPasswords;
    }

    public void setHashPasswords(String hashPasswords) {
        this.hashPasswords = hashPasswords;
    }

    public List<Ticket> getTicketsBooked() {
        return ticketsBooked;
    }

    public void setTicketsBooked(List<Ticket> ticketsBooked) {
        this.ticketsBooked = ticketsBooked;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", UUID='" + UUID + '\'' +
                ", password='" + password + '\'' +
                ", hashPasswords='" + hashPasswords + '\'' +
                ", ticketsBooked=" + ticketsBooked +
                '}';
    }
}
