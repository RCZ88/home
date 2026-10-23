package oop;

import java.util.ArrayList;

public class Season {
	private int year;
	private ArrayList<Team> teams;
	private ArrayList<Game> games;
	
	public Season (int year) {
		teams = new ArrayList<>();
		games = new ArrayList<>();
	}

	public int getYear() {
		return year;
	}

	public ArrayList<Team> getTeams() {
		return teams;
	}

	public ArrayList<Game> getGames() {
		return games;
	}
	
	public void addTeam(Team team) {
		teams.add(team);
	}
	public void removeTeam(Team team) {
		teams.remove(team);
	}
	public void schduleGame(Game game) {
		games.add(game);
	}
	public void print_standings() {
		int count = 1;
		for(Game g : games) {
			if(g.getDone() == true) {
				System.out.print(count++);
				g.printScore();
			}
		}
	}
}
