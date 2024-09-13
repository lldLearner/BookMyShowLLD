package Controller;

import Services.TheatreService;

public class TheatreController {
	
	//DI
	private TheatreService theatreService;

	public TheatreController(TheatreService theatreService) {
		super();
		this.theatreService = theatreService;
	}
	
	public String createTheatre(String theatreName) {
		String id = theatreService.createTheatre(theatreName);
		return id;
	}
	
	public String createScreenInTheatre(String screenName, String theatreId) {
		String id = theatreService.createScreenInTheatre(screenName, theatreId);
		return id;
	}
	
	public String createSeatInScreen(String screenId, int row, int seatNumber) {
		String id = theatreService.createSeatInScreen(screenId, row, seatNumber);
		return id;
	}

}
