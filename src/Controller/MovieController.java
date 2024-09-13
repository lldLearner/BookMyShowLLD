package Controller;

import Services.MovieService;

public class MovieController {

	private MovieService movieService;

	public MovieController(MovieService movieService) {
		super();
		this.movieService = movieService;
	}
	
	public String createMovie(String movieName, int durationInSeconds) {
		// TODO Auto-generated method stub
		
		String id = this.movieService.createMovie(movieName, durationInSeconds);
		return id;
	}
	
}
