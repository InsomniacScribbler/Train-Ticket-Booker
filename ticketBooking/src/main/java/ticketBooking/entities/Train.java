package ticketBooking.entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {
	private String trainId;
	private String trainNo;
	private List<List<Integer>> seats;
	private Map<String, Time> stationTimes;
	private List<String> trains;

	public Train(String trainId, String trainNo, List<List<Integer>> seats, Map<String, Time> stationTimes, List<String> trains) {
		this.trainId = trainId;
		this.trainNo = trainNo;
		this.seats = seats;
		this.stationTimes = stationTimes;
		this.trains = trains;
	}

	public String getTrainId() {
		return trainId;
	}

	public void setTrainId(String trainId) {
		this.trainId = trainId;
	}

	public String getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}

	public List<List<Integer>> getSeats() {
		return seats;
	}

	public void setSeats(List<List<Integer>> seats) {
		this.seats = seats;
	}

	public Map<String, Time> getStationTimes() {
		return stationTimes;
	}

	public void setStationTimes(Map<String, Time> stationTimes) {
		this.stationTimes = stationTimes;
	}

	public List<String> getTrains() {
		return trains;
	}

	public void setTrains(List<String> trains) {
		this.trains = trains;
	}

	@Override
	public String toString() {
		return "Train{" +
				"trainId='" + trainId + '\'' +
				", trainNo='" + trainNo + '\'' +
				", seats=" + seats +
				", stationTimes=" + stationTimes +
				", trains=" + trains +
				'}';
	}
}
