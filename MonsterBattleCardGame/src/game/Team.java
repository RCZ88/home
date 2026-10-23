package game;

public class Team {
	public Monster[]monsters;
	public Match currentMatch;
	public int monsterCount;
	public boolean win;
	public String name;
	public int teamID; 
	public Team(String name, int teamID) {
		monsters = new Monster[3];
		this.monsterCount = 0;
		this.name = name;
		this.teamID = teamID;
	}
	public void addMonster(Monster monster) {
		monsters[monsterCount] = monster;;
		monsterCount++;
	}
	public boolean checkLose() {
		for(int i = 0; i< this.monsters.length; i++) {
			if(monsters[i].alive) {
				return false;
			}
		}
		return true;
	}
}
