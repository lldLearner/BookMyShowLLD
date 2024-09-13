import Controller.BookingController;
import Controller.MovieController;
import Controller.ShowController;
import Controller.TheatreController;
import Services.BookingService;
import Services.MovieService;
import Services.ShowService;
import Services.TheatreService;

public class Client {

	private final TheatreController theatreController;
	private final MovieController movieController;
	private final ShowController showController;
	private final BookingController bookingController;
	private final TheatreService theatreService;
	private final MovieService movieService;
	private final ShowService showService;
	private final BookingService bookingService;
	
	public Client() {
		this.theatreService = new TheatreService();
		this.movieService = new MovieService();
		this.showService = new ShowService(movieService, theatreService);
		this.bookingService = new BookingService();
		
		this.theatreController = new TheatreController(theatreService);
		this.movieController = new MovieController(movieService);
		this.showController = new ShowController(theatreService, movieService, showService);
		this.bookingController = new BookingController(showService, theatreService, bookingService);
	}
	
	public static void main(String[] args) {
		
	}
}
