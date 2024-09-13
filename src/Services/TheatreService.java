package Services;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import Entities.Screen;
import Entities.Seat;
import Entities.Theatre;

public class TheatreService {

	//In memory Database
	private Map<String, Theatre> theatreStore;
	private Map<String, Screen> screenStore;
	private Map<String, Seat> seatStore;
	
	public TheatreService() {
		super();
		this.theatreStore = new HashMap<>();
		this.screenStore = new HashMap<>();
		this.seatStore = new HashMap<>();
	}

	//createTheatre(theatreName)
	//createScreenInTheatre(screenName, theatreId)//Composition As screen cannot exist without theatre
	//createSeatInScreen(row, seatNumber, screenId) // Again Composition 
	
	public String createTheatre(String theatreName) {
		String id = UUID.randomUUID().toString();
		Theatre theatre = new Theatre(id, theatreName);
		theatreStore.put(id, theatre);
		return id;
	}
	
	public String createScreenInTheatre(String screenName, String theatreId) {
		String id = UUID.randomUUID().toString();
		Theatre theatre = theatreStore.get(theatreId);
		Screen screen = new Screen(id, theatre, screenName);
		screenStore.put(id, screen);
		return id;
	}
	
	public String createSeatInScreen(String screenId, int row, int seatNumber) {
		String id = UUID.randomUUID().toString();
		Screen screen = screenStore.get(screenId);
		Seat seat = new Seat(id, row, seatNumber);
		seatStore.put(id, seat);
		screen.addSeat(seat);
		return id;
	}

	public Theatre getTheatreById(String theatreID) {
		// TODO Auto-generated method stub
		return this.theatreStore.get(theatreID);
	}

	public Screen getScreenById(String screenID) {
		// TODO Auto-generated method stub
		return this.screenStore.get(screenID);
	}
	
	public Seat getSeatById(String seatId) {
		return this.seatStore.get(seatId);
	}
}
