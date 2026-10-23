package oop;

public class Game {
	private Team awayTeam;
	private Team homeTeam;
	private String date;
	private int atScore;
	private int htScore;
	protected int atRebound;
	protected int htRebound;
	protected int atBlocks; 
	protected int htBlocks;
	private boolean done;
	private Team winner;
	private Team loser;
	private boolean draw;
	
	public Game(Team awayTeam, Team homeTeam, String date) {
		this.awayTeam = awayTeam;
		this.homeTeam = homeTeam;
		this.date = date;
		this.done = false;
	}
	
	public Team getWinner() {
		return winner;
	}

	public Team getLoser() {
		return loser;
	}

	public Team getAwayTeam() {
		return awayTeam;
	}

	public Team getHomeTeam() {
		return homeTeam;
	}

	public String getDate() {
		return date;
	}

	public int getAtScore() {
		return atScore;
	}

	public int getHtScore() {
		return htScore;
	}
	public boolean getDone() {
		return done;
	}

	public void updateScore(String teamName, int score) {
		if(teamName.equals(awayTeam.getName())) {
			atScore+=score;
		}else if(teamName.equals(homeTeam.getName())) {
			htScore+=score;
		}else {
			System.out.println("Team not Found!");
		}
	}
	public void printScore() {
		System.out.println(homeTeam.getName() + " " + htScore + " : " + atScore + " " + awayTeam.getName());
	}
	public void matchEnded() {
		done = true;
		if(atScore>htScore) {
			winner = awayTeam;
			awayTeam.wins++;
			loser = homeTeam;
			homeTeam.loses++;
		}else if(atScore<htScore) {
			winner = homeTeam;
			homeTeam.wins++;
			loser = awayTeam;
			awayTeam.loses++;
		}else {
			draw = true;
		}
		System.out.println("Match has Ended! Good Game!");
	}
	public void printResult() {
		if(done == true) {
			System.out.println("Match Ended!");
			if(draw) {
				System.out.println("It's a Draw!");
			}else {
				System.out.println(winner.getName() + "Wins!");
			}
			System.out.println("         ----Scores----");
			printScore();
			System.out.println("         ----Rebounces----");
			System.out.println(homeTeam.getName() + " " + htRebound + " : " + atRebound + " " + awayTeam.getName());
			System.out.println("         ----Blocks----");
			System.out.println(homeTeam.getName() + " " + htBlocks + " : " + atBlocks + " " + awayTeam.getName());
		}
	}
}
