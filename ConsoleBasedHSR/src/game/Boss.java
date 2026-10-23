package game;

import java.util.Random;

import game.CombatType.DarkType;

public class Boss extends Enemies {
	private int level;
	
    Boss(int level, EnemyTeam team) {
        super(level);
    	this.level = level;
    }
    private CombatType CT = new CombatType().new DarkType();
    CombatType[] weaknesses = ((DarkType) CT).getWeaknesses();

    this.HP_MULTI_IR = 2.1;
    this.INITIAL_HP = 2500;
    private static final double DMG_MULTI_IR = 2;
    private static final int INITIAL_DMG = 120;
    private static final double SHIELDPOINTS_IR = 2.5;
    private static final int INITIAL_SHIELDPOINTS = 200;
    private static final double BREAKDMG_MULTI_IR = 0.01;
    private static final double INITIAL_BREAKDMG = 1.5;
    
    private int fixedHP = calcStats(INITIAL_HP, HP_MULTI_IR); 
    private int hp = calcStats(INITIAL_HP, HP_MULTI_IR);
    private int dmg = calcStats(INITIAL_DMG, DMG_MULTI_IR);
    private int shield = calcStats(INITIAL_SHIELDPOINTS, SHIELDPOINTS_IR);
    private int breakdmg = (int)(INITIAL_BREAKDMG + level*BREAKDMG_MULTI_IR);
    private double skillDamageMultiplier;
   
    public void basicAttack() {
    	skillDamageMultiplier = 2.2;
    	int damage = (int) (dmg*skillDamageMultiplier);
    	int [] t = target(1);
    	Heroes [] team = Team.getTeam();
    	for(int i = 0; i<t.length; i++) {
    		if (team[t[i]] instanceof DrRatio) {
            	// Cast to DrRatio and access its properties
            	DrRatio drRatio = (DrRatio) team[i];
            	drRatio.attacked(damage);
            	// Perform attack logic on DrRatio (e.g., reduce health)
            } else if (team[t[i]] instanceof BlackSwan) {
            	// Cast to BlackSwan and access its properties
            	BlackSwan blackSwan = (BlackSwan) team[i];
            	blackSwan.attacked(damage);
            	// Perform attack logic on BlackSwan
            } else {
            	// Handle other hero types (if applicable)
            }
    	}
    	this.skillDamageMultiplier = 1;
    }
    public void specialAttack() {
    	this.skillDamageMultiplier = 1.2;
    	int damage = (int) (dmg*skillDamageMultiplier);
    	int [] t = target(4);
    	Heroes [] team = Team.getTeam();
    	for(int i = 0; i<t.length; i++) {
    		if (team[t[i]] instanceof DrRatio) {
            	// Cast to DrRatio and access its properties
            	DrRatio drRatio = (DrRatio) team[i];
            	drRatio.attacked(damage);
            	// Perform attack logic on DrRatio (e.g., reduce health)
            } else if (team[t[i]] instanceof BlackSwan) {
            	// Cast to BlackSwan and access its properties
            	BlackSwan blackSwan = (BlackSwan) team[i];
            	blackSwan.attacked(damage);
            	// Perform attack logic on BlackSwan
            } else {
            	// Handle other hero types (if applicable)
            }
    	}
    	this.skillDamageMultiplier = 1;
    }
	}  
}


