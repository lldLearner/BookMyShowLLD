package Entities;

public class Movie {

	private String id;
	private String name;
	private int durationInSeconds;
	
	public Movie(String id, String name, int durationInSeconds) {
		super();
		this.id = id;
		this.name = name;
		this.durationInSeconds = durationInSeconds;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getDurationInSeconds() {
		return durationInSeconds;
	}
}
