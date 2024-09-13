package Entities;

import java.util.Date;

public class Show {

	private String id;
	private Movie movie;
	private Screen screen;
	private Date startTime;
	private int durationInSeconds;
	
	public Show(String id, Movie movie, Screen screen, Date startTime, int durationInSeconds) {
		super();
		this.id = id;
		this.movie = movie;
		this.screen = screen;
		this.startTime = startTime;
		this.durationInSeconds = durationInSeconds;
	}

	public String getId() {
		return id;
	}

	public Movie getMovie() {
		return movie;
	}

	public Screen getScreen() {
		return screen;
	}

	public Date getStartTime() {
		return startTime;
	}

	public int getDurationInSeconds() {
		return durationInSeconds;
	}
}
