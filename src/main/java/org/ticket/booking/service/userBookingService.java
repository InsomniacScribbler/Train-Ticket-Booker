package org.ticket.booking.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.ticket.booking.entities.Ticket;
import org.ticket.booking.entities.User;
import org.ticket.booking.util.UserServiceUtil;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class userBookingService {
    private User user;

    private List<User> userList;

    private static  final ObjectMapper objectMapper = new ObjectMapper();

    private static final String USERS_PATH ="app/src/main/java/org/tickect/booking/localDb/users.json";

    private static final String TRAINS_PATH ="app/src/main/java/org/tickect/booking/localDb/trains.json";

    public userBookingService(User user) throws IOException {
        this.user =  user;
        File users = new File(USERS_PATH);
        userList = objectMapper.readValue(users, new TypeReference<List<User>>() {});
    }

    public Boolean loginUser() {
        Optional<User> foundUser = userList.stream()
                .filter(user1 -> user1.getName().equalsIgnoreCase(user.getName()) &&
                        UserServiceUtil.checkPassword(user.getPassword(), user1.getHashPasswords()))
                .findFirst();

        return foundUser.isPresent();
    }

    public Boolean signUp(User user1){
        try{
            userList.add(user1);
            saveUserListToFile();
            return Boolean.TRUE;
        } catch (IOException e) {
            return Boolean.FALSE;
        }
    }

    private void saveUserListToFile() throws IOException{
        File usersFile = new File(USERS_PATH);
        objectMapper.writeValue(usersFile,userList);
    }

    public void fetchBooking(){

        System.out.println(user.getTicketsBooked());
    }
    public void cancelBooking(Ticket ticket){
        if(loginUser()){
            Optional<Ticket> ticketToCancel = user.getTicketsBooked().stream().filter(t -> t.getTicketId().equalsIgnoreCase(ticket.getTicketId())).findFirst();
            if(ticketToCancel.isPresent()){
                user.getTicketsBooked().remove(ticketToCancel.get());
                System.out.println("Booking Canceled successfully");
            }
            else System.out.println("Booking Not found!!!");

        }
        else System.out.println("User Not Logged In");

    }

}
