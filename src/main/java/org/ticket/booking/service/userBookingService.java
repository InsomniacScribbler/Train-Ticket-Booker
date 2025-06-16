package org.ticket.booking.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.ticket.booking.entities.User;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class userBookingService {
    private User user;
    private List<User> userList;
    private static  final ObjectMapper objectMapper = new ObjectMapper();
    private static final String USERS_PATH ="../localDb/users.json";
    private static final String TRAINS_PATH ="../localDb/trains.json";
    public userBookingService(User user) throws IOException {
        this.user =  user;
        File users = new File(USERS_PATH);
        userList = objectMapper.readValue(users, new TypeReference<List<User>>() {});

    }


}
