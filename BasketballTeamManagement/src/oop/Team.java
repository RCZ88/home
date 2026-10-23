package oop;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Team {
	private String name;
	private ArrayList<Player>players; 
	private ArrayList<Coach>coaches;
	private ArrayList<Game>games;
	protected int wins;
	protected int loses;
	
	public Team(String name, int wins, int loses) {
		this.name = name;
		this.wins = wins;
		this.loses = loses;
		players = new ArrayList<>();
		coaches = new ArrayList<>();
		games = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public ArrayList<Coach> getCoaches() {
		return coaches;
	}
	
	public ArrayList<Game> getGames(){
		return games;
	}

	public int getWins() {
		return wins;
	}

	public int getLoses() {
		return loses;
	}
	
	
	public void addPlayer(Player player) {
		players.add(player);
		player.setTeam(this);
	}
	public void removePlayer(Player player) {
		players.remove(player);
		player.setTeam(null);
	}
	public void addCoach(Coach coach) {
		coaches.add(coach);
	}
	public void removeCoach(Coach coach) {
		coaches.remove(coach);
	}
	public void printRoaster() {
		System.out.println(name + "'s Roaster: ");
		for(Player p : players) {
			System.out.println(p.getName() + " (Power: " + p.getPower() + ")");
		}
	}
	public void printRecord() {
		System.out.println(name + "'s Record");
		System.out.println("Wins: " + wins);
		System.out.println("Loses: " + loses);
		DecimalFormat f = new DecimalFormat("##.00");
		double winrate = Double.parseDouble(f.format(((double)wins/(wins+loses)) * 100)); 
		System.out.println("Winrate: " + winrate + "%");
		
	}
}
