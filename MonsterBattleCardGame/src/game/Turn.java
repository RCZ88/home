package game;

public class Turn {
	public long timeStamp;
	public String abilityName;
	public Monster from;
	public Monster to;
	public int damage;
	public int heal;
	public int DOHODAH;//(damage) or (heal) or (damage and heal)
	public static int turnCount;
	public static final int DAMAGE = 1;
	public static final int HEAL = 2;
	public static final int DAMAGEANDHEAL = 3;
	public Turn(long timeStamp, String abilityName, Monster from, Monster to, int doh, boolean which) {
		this.timeStamp = timeStamp;
		this.abilityName = abilityName;
		this.from = from;
		this.to = to;
		if(which) {
			heal = doh;
			DOHODAH = 2;
		}else {
			damage = doh;
			DOHODAH = 1;
		}
	}
	public Turn(long timeStamp, String abilityName, Monster from, Monster to, int damage, int heal) {
		this.timeStamp = timeStamp;
		this.abilityName = abilityName;
		this.from = from;
		this.to = to;
		this.damage = damage;
		this.heal = heal; 
		this.DOHODAH = 3;
	}
	
	@Override
	public String toString() {
		switch(DOHODAH) {
		case DAMAGE:
			return "Turn [timeStamp=" + timeStamp + ", from=" + from + ", to=" + to + ", damage=" + damage + "]";
		case HEAL:
			return "Turn [timeStamp=" + timeStamp + ", from=" + from + ", to=" + to + ", heal=" + heal + "]";
		}
		return "Turn [timeStamp=" + timeStamp + ", from=" + from + ", to=" + to + ", damage=" + damage + ", heal=" + heal + "]";
	}
	
}
