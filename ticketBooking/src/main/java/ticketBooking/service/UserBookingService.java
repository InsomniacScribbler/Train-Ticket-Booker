package ticketBooking.service;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.w3c.dom.ls.LSOutput;
import ticketBooking.Util.UserServiceUtil;
import ticketBooking.entities.Ticket;
import ticketBooking.entities.User;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class UserBookingService {
	private User user;
	private List<User> userList;
	private static ObjectMapper objectMapper = new ObjectMapper();

	private static final String USERS_PATH = "src/main/java/ticketBookin/localDb/users.json";
	//De-Serialize
	public UserBookingService(User user1) throws IOException {
		this.user = user1;
		File users = new File(USERS_PATH);
		userList = objectMapper.readValue(users, new TypeReference<List<User>>() {
		});
	}
	//Serialize
	public void saveUserListtoFile() throws IOException {
		File userFile = new File(USERS_PATH);
		objectMapper.writeValue(userFile,userList);
	}

	//Login for user
	public boolean loginUser(){
		Optional<User> foundUser = userList.stream().filter(user1 ->
			 user1.getName().equals(user.getName())&& UserServiceUtil.checkPassword(user.getPassword(),user1.getHashedpassword())).findFirst();
		foundUser.ifPresent(u -> this.user = u);
		return foundUser.isPresent();
	}

	//SignUp of user
	public boolean SignUp(User user1){
		try{
			user1.setHashedpassword(UserServiceUtil.hashPassword(user1.getPassword()));
			user1.setPassword(null); // dont store raw password
			userList.add(user1);
			saveUserListtoFile();
			return Boolean.TRUE;
		}
		catch (IOException e){
			return Boolean.FALSE;
		}
	}

	//Fetch Booking
	public void fetchBooking(){
		if (loginUser()){
			List<Ticket> bookedTickets = user.getTicketsBooked();
			if(bookedTickets ==  null || bookedTickets.isEmpty()){
				System.out.println("No tickets booked!!");
			}
			else
				bookedTickets.forEach(System.out::println);
		}
		else
			System.out.println("Not Logged In to any account");
	}

	public void cancelBooking (Ticket ticket) throws IOException {
		if (loginUser()){
			Optional<Ticket> ticketToCancel = user.getTicketsBooked().stream().filter(t -> t.gettId().equalsIgnoreCase(ticket.gettId())).findFirst();

			if (ticketToCancel.isPresent()){
				user.getTicketsBooked().remove(ticketToCancel.get());
				saveUserListtoFile();
				System.out.println("Booking Cancelled Succesfully");
			}
			else System.out.println("Booking Not found !!!");
		}
		else System.out.println("Please Log In first!");
		}
	}


