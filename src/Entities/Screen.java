package Entities;

import java.util.ArrayList;
import java.util.List;

public class Screen {

	private String id;
	private List<Seat> seats;
	private Theatre theatre;
	private String screenName;
	
	public Screen(String id, Theatre theatre, String screenName) {
		super();
		this.id = id;
		this.seats = new ArrayList<>();
		this.theatre = theatre;
		this.screenName = screenName;
	}

	public String getId() {
		return id;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public Theatre getTheatre() {
		return theatre;
	}
	
	public void addSeat(Seat seat) {
		this.seats.add(seat);
	}
}
