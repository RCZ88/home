package game;

import java.util.ArrayList;
import java.util.Collections;

public class Arena {
	public Team[]teams;
	public Match[]matches;
	public int teamAmount;
	public int currentMatchAmount;
	public Arena(int amountOfTeams) {
		teams = new Team[amountOfTeams];
		matches = new Match[amountOfTeams/2-1];
		teamAmount = 0;
	}
	public void addTeam(String name) {
		this.teams[teamAmount++] = new Team(name, teamAmount);
	}
	public Monster recommendAttackingMonster(int teamID, Monster defender) {
		int max = 0;
		Monster maxMonster = null;
		Team team = teams[teamID];
		for(int i = 0; i<team.monsterCount; i++) {
			if(Monster.getAttackingWeight(team.monsters[i], defender)>max) {
				max = Monster.getAttackingWeight(team.monsters[i], defender);
				maxMonster = team.monsters[i];
			}
		}
		return maxMonster;
		
	}
	public boolean checkTeamAmount(int amount) {
		int count = 2;
		while(count<amount) {
			if(count == amount) {
				return true;
			}
			count = count*2;
		}
		return false;
	}
	public void shuffleTeam() {
		ArrayList<Team>teams = new ArrayList<>();
		for(int i = 0; i<this.teams.length; i++) {
			teams.add(this.teams[i]);
		}
		Collections.shuffle(teams);
		int count = 0;
		Team a = null;
		Team b = null;
		for(Team team : teams) {
			if(count % 2 == 0) {
				a = team;
			}else {
				b = team;
				Match match = new Match(this, a, b);
				for(Monster monster : a.monsters) {
					monster.match = match;
				}
				for(Monster monster : b.monsters) {
					monster.match = match;
				}
				addMatch(match);
			}
		}
	}
	public void addMatch(Match match) {
		matches[currentMatchAmount] = match;
		currentMatchAmount++;
	}
}
