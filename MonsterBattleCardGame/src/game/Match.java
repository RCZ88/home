package game;

import java.util.LinkedList;

public class Match {
	public Arena arena;
	public Team teamA;
	public Team teamB;
	public Team winner;
	public Team loser;
	public LinkedList<Turn>gameLog = new LinkedList<>();
	public Match(Arena arena, Team teamA, Team teamB) {
		this.arena = arena;
		this.teamA = teamA;
		this.teamB = teamB;
		teamA.currentMatch = this;
		teamB.currentMatch = this;
	}
	public Match(Arena arena, Team teamA) {
		this.arena = arena;
		this.teamA = teamA;
		teamA.currentMatch = this;
	}
	public void rewindTurns(int tsStart, int tsEnd) {
		for(int i = tsStart; i <= tsEnd; i++) {
			Turn log = gameLog.get(i);
			switch(log.DOHODAH) {
			case 1:
				Ability.heal(null, log.damage); 
			}
		}
	}
	public void setupNewMatch() {
		if(arena.currentMatchAmount <= arena.matches.length-1) {
			if(arena.matches[arena.currentMatchAmount-1].teamB == null) {
				arena.matches[arena.currentMatchAmount].teamB = winner;
			}else {
				arena.addMatch(new Match(arena, winner));
			}
		}else {
			System.out.println("Congrats to Team " +  winner + "For Winning This Tournament!");
		}
	}
	public void checkWinner() {
		if(teamA.checkLose()) {
			winner = teamB;
			loser = teamA;
		}else if(teamB.checkLose()) {
			winner = teamA;
			loser = teamB;
		}
	}
	public void addLog(Turn turn) {
		gameLog.add(turn);
	}
}
