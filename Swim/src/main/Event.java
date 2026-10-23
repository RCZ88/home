package main;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Event {
	private String eventID;
	private int numberOfRace;
	ArrayList<Race> races;
	private Race finals;
	
	public Event(String eventID, int numberOfRace) {
		this.eventID = eventID;
		this.numberOfRace = numberOfRace;
		races = new ArrayList<>();
	}
	
	public String getEventID() {
		return eventID;
	}

	public void setEventID(String eventID) {
		this.eventID = eventID;
	}

	public int getNumberOfRace() {
		return numberOfRace;
	}

	public void setNumberOfRace(int numberOfRace) {
		this.numberOfRace = numberOfRace;
	}

	public ArrayList<Race> getRaces() {
		return races;
	}

	public void setRaces(ArrayList<Race> races) {
		this.races = races;
	}

	public Race getFinals() {
		return finals;
	}

	public void setFinals(Race finals) {
		this.finals = finals;
	}

	public void fillFinals() {
		finals = new Race();
		int count = 0;
		TreeMap <Swimmer, Double> p = new TreeMap<>();
		for(Race race : races) {
			for(Entry<Swimmer, Double> placement : race.getPlacement().entrySet()) {
				p.put(placement.getKey(), placement.getValue());
			}
		}
		for(Map.Entry<Swimmer, Double> entry : p.entrySet()) {
			if(count < 8) {
				finals.addPlacement(entry.getKey(), 0);
				count++;
			}else {
				break;
			}
		}
		
		races.add(finals);
	}
	
}
