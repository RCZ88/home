package game;

public class EnemyTeam {
	private static Enemies [] ET = new Enemies[4];
	
	EnemyTeam(Enemies e1, Enemies e2, Enemies e3, Enemies e4){
		ET[0] = e1;
		ET[1] = e2;
		ET[2] = e3;
		ET[3] = e4;
	}
	
	public static Enemies[] getEnemyTeam() {
		return ET;
	}
}
