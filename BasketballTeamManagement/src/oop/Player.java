package oop;

import java.text.DecimalFormat;

public class Player {
	private String name;
	private int age;
	private Team team;
	private String position;
	private double height;
	private double weight;
	private int jerseyNumber;
	private int pointsScored ,tps;
	private int rebounds ,tr;
	private int assists, ta;
	private int blocks, tb;
	private int steals, ts;
	private int numberOfMatch;
	private double power;
	
	public Player(String name, int age, String position, double height, double weight, int jerseyNumber, int matches, int tps, int tr, int ta, int tb, int ts) {
		this.name = name;
		this.age = age;
		this.position = position;
		this.height = height;
		this.weight = weight;
		this.jerseyNumber = jerseyNumber;
		this.tr = tr;
		this.ta = ta; 
		this.tb  = tb;
		this.ts = ts; 
		numberOfMatch = matches;
		calcPower();
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPosition() {
		return position;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public int getJerseyNumber() {
		return jerseyNumber;
	}
	public int getPointsScored() {
		return pointsScored;
	}
	public int getRebounds() {
		return rebounds;
	}
	public int getAssists() {
		return assists;
	}
	public int getBlocks() {
		return blocks;
	}
	public int getSteals() {
		return steals;
	}
	public int getTps() {
		return tps;
	}

	public int getTr() {
		return tr;
	}

	public int getTa() {
		return ta;
	}

	public int getTb() {
		return tb;
	}

	public int getTs() {
		return ts;
	}

	public int getNumberOfMatch() {
		return numberOfMatch;
	}

	public double getPower() {
		return power;
	}
	private void calcPower() {
		DecimalFormat f = new DecimalFormat("##.00");
	    double sum = ((double) tps * 3) + ((double) ta * 2) + ((double) tr * 2) + ((double) tb);
	    power = Double.valueOf((f.format((sum/ numberOfMatch))));
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public void scorePoints(int points, Game game) {
		pointsScored+= points;
		tps +=points;
		if(team == game.getAwayTeam()) {
			game.updateScore(team.getName(), (game.getAtScore()+points));
		}else {
			game.updateScore(team.getName(), (game.getHtScore()+points));
		}
	}
	public void rebounds(int rebounds, Game game) {
		this.rebounds +=rebounds;
		tr +=rebounds;
		if(team == game.getAwayTeam()) {
			game.atRebound +=rebounds;
			scorePoints(rebounds, game);
		}else {
			game.htRebound +=rebounds;
		}
	}
	public void assists(int assists) {
		this.assists+= assists;
		this.ta += assists;
	}
	public void blocks(int blocks, Game game) {
		this.blocks += blocks;
		this.tb +=blocks;
		if(team == game.getAwayTeam()) {
			game.atBlocks += blocks;
		}else {
			game.htBlocks += blocks;
		}
	}
	public void steals(int steals) {
		this.steals+= steals; 
		this.ts += steals;
	}
	public void addMatch() {
		numberOfMatch++;
	}
	public void printGameStats() {
		System.out.println("Player name: " + name + "\nPoints: " + pointsScored + " Assists: " + assists + " Rebounds: " + rebounds + " Blocks: " + blocks);
	}
	public void printAverage() {
		System.out.println(name + "'s  Average Stats");
		double aps = tps/numberOfMatch;
		double ar = tr/numberOfMatch;
		double aa = ta/numberOfMatch;
		double ab = tb/numberOfMatch;
		double as = ts/numberOfMatch;
		System.out.println("Player name: " + name + "\nAVGPoints: " + aps +  " AVGAssist: " + aa +" AVGRebounds: " + ar + " AVGBlocks: " + ab + " AVGSteal: " + as);
	}
	public void printTotal() {
		System.out.println(name + "'s Total Stats: ");
		System.out.println("Player name: " + name + "\nPoints: " + tps + " Assists: " + ta + " Rebounds: " + tr + " Blocks: " + tb);
	}
}
