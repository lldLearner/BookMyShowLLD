package Services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import Entities.Booking;
import Entities.BookingStatus;
import Entities.Seat;
import Entities.Show;

public class BookingService {

	private Map<String, Booking> bookingStore;
	//createBooking(showId, seatIds, bookedByUser)

	public BookingService() {
		this.bookingStore = new HashMap<>();
	}
	public String createBooking(Show show, List<Seat> seats, String bookedByUser) {
		// TODO Auto-generated method stub
		
		String id = UUID.randomUUID().toString();
		Booking booking = new Booking(id, bookedByUser, show, seats, BookingStatus.CREATED);
		this.bookingStore.put(id, booking);
		return id;
	}
}
