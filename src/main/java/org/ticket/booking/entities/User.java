package org.ticket.booking.entities;

import org.ticket.booking.util.UserServiceUtil;

import java.util.List;

public class User {
    private String name;
    private String UUID;
    private String password;
    private String hashPasswords;
    private List<Ticket> ticketsBooked;

    public User() {}

    public User(String name, String UUID, String password, String hashPasswords, List<Ticket> ticketsBooked) {
        this.name = name;
        this.UUID = UUID;
        this.password = password;
        this.hashPasswords = hashPasswords;
        this.ticketsBooked = ticketsBooked;
    }

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

    public void setHashPasswords(String password) {
        this.hashPasswords = UserServiceUtil.hashPassword(password);
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
