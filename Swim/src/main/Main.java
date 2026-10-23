package main;

import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Swimmer swimmer1 = new Swimmer("Alice", "Ocean High");
		    Swimmer swimmer2 = new Swimmer("Bob", "Riverdale");
		    Swimmer swimmer3 = new Swimmer("Charlie", "Ocean High");

		    // Add some event IDs and times for swimmers
		    swimmer1.setEventId(new String[]{"E100", "E200"});
		    swimmer1.setTime(new double[]{100.50, 125.23});
		    swimmer2.setEventId(new String[]{"E100", "E400"});
		    swimmer2.setTime(new double[]{98.76, 180.10});
		    swimmer3.setEventId(new String[]{"E200", "E400"});
		    swimmer3.setTime(new double[]{122.11, 175.45});

		    // Create a new Race event
		    Event event = new Event("E100", 2); // Event ID: E100, Number of Races: 2

		    // Add swimmers to the Race
		    Race race1 = new Race();
		    race1.addPlacement(swimmer1, swimmer1.getTime()[0]);
		    race1.addPlacement(swimmer2, swimmer2.getTime()[0]);
		    event.races.add(race1);

		    Race race2 = new Race();
		    race2.addPlacement(swimmer1, swimmer1.getTime()[0]); // Assuming both races use the same event ID (E100)
		    race2.addPlacement(swimmer3, swimmer3.getTime()[0]);
		    event.races.add(race2);

		    // Fill the finals for this event (assuming top 8 from all races)
		    event.fillFinals();

		    // Print some information
		    System.out.println("Event: " + event.getEventID());
		    System.out.println("Number of Races: " + event.getNumberOfRace());
		    System.out.println("\nFinalists:");
		    for (Entry<Swimmer, Double> entry : event.getFinals().getPlacement().entrySet()) {
		      System.out.println(entry.getKey().getName() + " (" + entry.getKey().getSchool() + ")");
		    }
	}

}
