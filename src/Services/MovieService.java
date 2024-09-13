package Services;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import Entities.Movie;

public class MovieService {

	private Map<String, Movie> movieStore;

	public MovieService() {
		super();
		this.movieStore = new HashMap<>();
	}
	
	public String createMovie(String movieName, int durationInSeconds) {
		// TODO Auto-generated method stub
		
		String id = UUID.randomUUID().toString();
		Movie movie = new Movie(id, movieName, durationInSeconds);
		movieStore.put(id, movie);
		return id;
	}

	public Movie getMovieById(String movieId) {
		// TODO Auto-generated method stub
		return this.movieStore.get(movieId);
	}
	
	
}
