package Controller;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import Entities.Movie;
import Entities.Screen;
import Entities.Seat;
import Entities.Show;
import Services.MovieService;
import Services.ShowService;
import Services.TheatreService;

public class ShowController {

	private TheatreService theatreService;
	private MovieService movieService;
	private ShowService showService;
	
	public ShowController(TheatreService theatreService, MovieService movieService, ShowService showService) {
		super();
		this.theatreService = theatreService;
		this.movieService = movieService;
		this.showService = showService;
	}

	public String createShow(String movieId, Date startTime, String screenId) {
		// TODO Auto-generated method stub
		Screen screen = theatreService.getScreenById(screenId);
		Movie movie = movieService.getMovieById(movieId);
		return showService.createShow(movie, startTime, screen);
	}
	
	public List<String> availableSeats(String showId) {
		
		//fetch the screen on which show is playing
		//fetch the total number of seats in that screen
		//fetch the total number of booked seats
		//return total number of seats - booked number of seats
		Show show = showService.getShowById(showId);
		return showService.availableSeats(show).stream().map(Seat::getId).collect(Collectors.toList());
	}
}
