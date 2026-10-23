package game;

import java.util.Random;

import game.CombatType.DarkType;

public abstract class Enemies {
	protected int level;
    protected CombatType[] weaknesses;
    protected double skillDamageMultiplier;
    
    private CombatType CT ;

    protected static double HP_MULTI_IR;
    protected int INITIAL_HP;
    protected double DMG_MULTI_IR;
    protected int INITIAL_DMG;
    protected double SHIELDPOINTS_IR;
    protected int INITIAL_SHIELDPOINTS;
    protected double BREAKDMG_MULTI_IR;
    protected double INITIAL_BREAKDMG;


    private int fixedHP = calcStats(INITIAL_HP, HP_MULTI_IR);
    private int hp = calcStats(INITIAL_HP, HP_MULTI_IR);
    private int dmg = calcStats(INITIAL_DMG, DMG_MULTI_IR);
    private int shield = calcStats(INITIAL_SHIELDPOINTS, SHIELDPOINTS_IR);
    private int breakdmg = (int) (INITIAL_BREAKDMG + level * BREAKDMG_MULTI_IR);
    
    protected Team [] allies;
    
    // Constructor common to all enemies
    protected Enemies(int level) {
        this.level = level;
    }

    // Common method to calculate stats
    protected int calcStats(int initial, double IR) {
        return (int) Math.floor(initial + (level * IR));
    }

    // Common method to determine targets
    protected int[] target(int targetAmount) {
        Random r = new Random();
        if (targetAmount == 1) {
            int[] targets = new int[1];
            targets[0] = r.nextInt();
            return targets;
        } else if (targetAmount == 3) {
            int[] targets = new int[3];
            int centerTarget = r.nextInt() * 3 + 2;
            for (int i = -1; i < 2; i++) {
                targets[i + 1] = centerTarget + i;
            }
            return targets;
        } else if (targetAmount == 4) {
            int[] targets = new int[4];
            for (int i = 0; i < 4; i++) {
                targets[i] = i;
            }
            return targets;
        } else {
            return null;
        }
    }

    // Common method for attacked logic
    protected void attacked(int damage, int shieldDamage) {
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
        if (!broke && shield <= 0) {
            hp -= breakdmg;
            System.out.println("BREAK!");
            broke = true;
        }
    }

}
