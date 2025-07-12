package ticketBooking.entities;

import java.util.List;

public class User
{
	private  String password;
	private  String name;
	private  String uuid;
	private  String hashedpassword;
	private List<Ticket> ticketsBooked;

	public User(String password, String name, String uuid, String hashedpassword, List<Ticket> ticketsBooked) {
		this.password = password;
		this.name = name;
		this.uuid = uuid;
		this.hashedpassword = hashedpassword;
		this.ticketsBooked = ticketsBooked;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getHashedpassword() {
		return hashedpassword;
	}

	public void setHashedpassword(String hashedpassword) {
		this.hashedpassword = hashedpassword;
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
				"password='" + password + '\'' +
				", name='" + name + '\'' +
				", uuid='" + uuid + '\'' +
				", hashedpassword='" + hashedpassword + '\'' +
				", ticketsBooked=" + ticketsBooked +
				'}';
	}
}
