package org.ticket.booking.entities;

import java.util.Date;

public class Ticket {
    private String ticketId;
    private String UUID;
    private String source;
    private String destination;
    private Date dateOfTravel;
    private Train train;


    public Ticket(){}

    public Ticket(String ticketId, String UUID, String source, String destination, Date dateOfTravel, Train train) {
        this.ticketId = ticketId;
        this.UUID = UUID;
        this.source = source;
        this.destination = destination;
        this.dateOfTravel = dateOfTravel;
        this.train = train;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDateOfTravel() {
        return dateOfTravel;
    }

    public void setDateOfTravel(Date dateOfTravel) {
        this.dateOfTravel = dateOfTravel;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }


    public String getTicketInfo() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", UUID='" + UUID + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", dateOfTravel=" + dateOfTravel +
                ", train=" + train +
                '}';
    }
}
