package ticketBooking.entities;

import java.util.Date;

public class Ticket {
	private String tId;
	private String uuid;
	private String source;
	private String destination;
	private Date date_of_travel;
	private Train train;

	public Ticket(String tId, String uuid, String source, String destination, Date date_of_travel, Train train) {
		this.tId = tId;
		this.uuid = uuid;
		this.source = source;
		this.destination = destination;
		this.date_of_travel = date_of_travel;
		this.train = train;
	}

	public String gettId() {
		return tId;
	}

	public void settId(String tId) {
		this.tId = tId;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public Date getDate_of_travel() {
		return date_of_travel;
	}

	public void setDate_of_travel(Date date_of_travel) {
		this.date_of_travel = date_of_travel;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Override
	public String toString() {
		return "Ticket{" +
				"tId='" + tId + '\'' +
				", uuid='" + uuid + '\'' +
				", source='" + source + '\'' +
				", destination='" + destination + '\'' +
				", date_of_travel=" + date_of_travel +
				", train=" + train +
				'}';
	}
}
