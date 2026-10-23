package sem1;

public class P2OCT10 {

	public void addMonster(Monster M) {
		if(monsterCount < monsters.length) {
			boolean inTheArray = false;
			for(Monster m : monsters) {
				if(m == M) {
					inTheArray = true;
					break;
				}
			}
			if(inTheArray) {
				System.out.println("Monster is already in the Arena!");
				return;
			}else {
				monsters[monsterCount] = M;
			}
		}else {
			System.out.println("Monsters is full!");
		}
	}
	public void attack(Monster m) {
		m.health -= Monster.rollDice();
	}
	public void removeMonster(Monster M) {
		int index;
		for(int i = 0; i<monsters.length; i++) {
			if(monsters[i] == M) {
				monsters[i] = null;
				index = i;
				break;
			}
		}
		if(index != monsters.length-1) {
			if(monsters[index+1] != null) {
				for(int i = index+1; i<monsters.length; i++) {
					if(monsters[i] != null) {
						monsters[i-1] = monsters[i];
					}else {
						break;
					}
				}
			}
		}
	}
	public Monster recommendAttackingMonster(Monster defender) {
		Monster maxMonster = monsters[0];
		for(Monster m : monsters) {
			if(getAttackingWeight(m, defender) > getAttackingWeight(maxMonster, defender)) {
				maxMonster = m;
			}
		}
		return maxMonster;
	}
	public void rewindTurns(int numberOfTurns, Monster rewinder) {
		for(int i = 0; i<numberOfTurns; i++) {
			if(gameLog[i].to == rewinder) {
				gameLog[i].health += gameLog[i].damage;
			}
		}
	}

}
