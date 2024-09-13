package Services;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import Entities.Movie;
import Entities.Screen;
import Entities.Seat;
import Entities.Show;

public class ShowService {

	private Map<String, Show> showStore;
	
	//createShow(movieId, durationInSeconds, startTime, theatre)
	
	public ShowService(MovieService movieService, TheatreService theatreService) {
		super();
		this.showStore = new HashMap<>();
	}
	
	public String createShow(Movie movie, Date startTime, Screen screen) {
		// TODO Auto-generated method stub
		String id = UUID.randomUUID().toString();
		Show show =  new Show(id, movie, screen, startTime, movie.getDurationInSeconds());
		showStore.put(id, show);
		return id;
	}
	
	public List<Seat> availableSeats(Show show) {
		
		//fetch the screen on which show is playing
		//fetch the total number of seats in that screen
		//fetch the total number of booked seats
		//return total number of seats - booked number of seats
		List<Seat> totalSeats = show.getScreen().getSeats();
		List<Seat> bookedSeats = new ArrayList<>(totalSeats);
		return bookedSeats;
	}

	public Show getShowById(String showId) {
		// TODO Auto-generated method stub
		return this.showStore.get(showId);
	}


}
