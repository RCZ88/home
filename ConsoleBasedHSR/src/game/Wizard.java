package game;

import java.util.Random;

import game.CombatType.DarkType;

public class Wizard extends Enemies{
	private int level;

    Wizard(int level) {
        this.level = level;
    }

    private CombatType CT = new CombatType().new DarkType();
    private CombatType [] weaknesses = ((DarkType) CT).getWeaknesses();

    private static final double HP_MULTI_IR = 0.8;
    private static final int INITIAL_HP = 800;
    private static final double DMG_MULTI_IR = 2;
    private static final int INITIAL_DMG = 100;
    private static final double SHIELDPOINTS_IR = 1.5;  // Adjusted value
    private static final int INITIAL_SHIELDPOINTS = 80;  // Adjusted value
    private static final double BREAKDMG_MULTI_IR = 0.02;  // Adjusted value
    private static final double INITIAL_BREAKDMG = 2.0;  // Adjusted value


    private int fixedHP = calcStats(INITIAL_HP, HP_MULTI_IR);
    private int hp = calcStats(INITIAL_HP, HP_MULTI_IR);
    private int dmg = calcStats(INITIAL_DMG, DMG_MULTI_IR);
    private int shield = calcStats(INITIAL_SHIELDPOINTS, SHIELDPOINTS_IR);
    private int breakdmg = (int) (INITIAL_BREAKDMG + level * BREAKDMG_MULTI_IR);
    private double skillDamageMultiplier;
    
    private int calcStats(int initial, double IR) {
        return (int) Math.floor(initial + (level * IR));
    }

    private int[] target(int targetAmount) {
		Random r = new Random();
		if(targetAmount == 1) {
			int [] targets = new int[1];
			targets[0] = r.nextInt();
			return targets;
		}else if(targetAmount == 3) {
			int [] targets = new int[3];
			int centerTarget = r.nextInt()*3 + 2;
			for(int i = -1; i<2; i++) {
				targets[i+1] = centerTarget+i; 
			}
			return targets;
		}else if(targetAmount == 4) {
			int [] targets = new int[4];
			for(int i = 0; i<4; i++) {
				targets[i] = i;
			}
			return targets;
		}else {
			return null;
		}
	}
    public void basicAttack() {
    	skillDamageMultiplier = 1.2;
    	int damage = (int) (dmg*skillDamageMultiplier);
    	int [] t = target(3);
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
    	skillDamageMultiplier = 1;
    }

    public void attacked(int damage, int shieldDamage) {
        boolean broke = false;
        if (shield > 0) {
            hp -= damage * 0.9;
            shield -= shieldDamage;
        } else if (shield < 0) {
            shield += shield * -1;
            hp -= damage;
        } else if (shield == 0) {
            hp -= damage;
        }
        if (!broke) {
            if (shield <= 0) {
                hp -= breakdmg;
                System.out.println("BREAK!");
                broke = true;
            }
        }
    }
}
