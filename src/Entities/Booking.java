package Entities;

import java.util.List;

public class Booking {

	private String id;
	private String bookedByUser;
	private Show show;
	private List<Seat> seat;
	private BookingStatus status;
	
	public Booking(String id, String bookedByUser, Show show, List<Seat> seat, BookingStatus status) {
		super();
		this.id = id;
		this.bookedByUser = bookedByUser;
		this.show = show;
		this.seat = seat;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public String getBookedByUser() {
		return bookedByUser;
	}

	public Show getShow() {
		return show;
	}

	public List<Seat> getSeat() {
		return seat;
	}

	public BookingStatus getStatus() {
		return status;
	}
}
