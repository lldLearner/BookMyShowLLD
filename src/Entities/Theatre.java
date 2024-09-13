package Entities;

import java.util.ArrayList;
import java.util.List;

public class Theatre {

	private String id;
	private String name;
	private List<Screen> screens;

	public Theatre(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.screens = new ArrayList<>();
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScreens(List<Screen> screens) {
		this.screens = screens;
	}
}
