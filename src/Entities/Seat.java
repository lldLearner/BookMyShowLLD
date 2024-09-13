package Entities;

public class Seat {
	
	private String id;
	private int row;
	private int seatNumber;
	
	
	public Seat(String id, int row, int seatNumber) {
		super();
		this.id = id;
		this.row = row;
		this.seatNumber = seatNumber;
	}
	
	public String getId() {
		return id;
	}
	public int getRow() {
		return row;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
}
