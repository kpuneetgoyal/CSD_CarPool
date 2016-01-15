package com.org.carpool;

import java.util.ArrayList;
import java.util.Date;

public class Ride {
	
	String name;
	String source;
	String destination;
	String starttime;
	int availableSeats;
	int booked;
	
	public String getPublishedId() {
		return name;
	}
	public void setPublishedId(String publishedId) {
		this.name = publishedId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	
}
