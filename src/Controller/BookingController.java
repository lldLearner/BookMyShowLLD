package Controller;

import java.util.List;
import java.util.stream.Collectors;

import Entities.Seat;
import Entities.Show;
import Services.BookingService;
import Services.ShowService;
import Services.TheatreService;

public class BookingController {

	private ShowService showService;
	private TheatreService theatreService;
	private BookingService bookingService;
	//createBooking(showId, seatIds, bookedByUser)
	
	public BookingController(ShowService showService, TheatreService theatreService, BookingService bookingService) {
		super();
		this.showService = showService;
		this.theatreService = theatreService;
		this.bookingService = bookingService;
	}
	
	
	public String createBooking(String showId, List<String> seatIds, String bookedByUser) {
		
		Show show = this.showService.getShowById(showId);
		List<Seat> seats = seatIds.stream().map(theatreService::getSeatById).collect(Collectors.toList());
		return bookingService.createBooking(show, seats, bookedByUser);
	}
	
}
