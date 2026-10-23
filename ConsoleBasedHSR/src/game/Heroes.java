package game;

import java.util.Random;

public abstract class Heroes {
	protected Team team;

    // Default constructor
    public Heroes() {
        // Default initialization
    }

    // Parameterized constructor
    public Heroes(Team team) {
        this.team = team;
    }

    protected int level;
    protected int asc;
    protected CombatType CT;
    
    protected int baseHp;
    protected double baseDamage;
    protected double baseCritChance;
    protected double baseCritBoost;
    protected double baseDefense;
    protected int baseHealAmount;
    protected double baseDamageBuff;
    protected double baseExtraDamage;
    protected double baseAddedCritChance;
    protected double baseShieldDamage;

    protected double baseBasicMulti;
    protected double baseSpecialMulti;
    protected double baseUltMulti;

    protected static double HP_IR = 4.0;
    protected static double DAMAGE_IR = 5.0;
    protected static double DEFENSE_IR = 0.4;
    protected static double CRITCHANCE_IR = 0.3;
    protected static double CRITBOOST_IR = 4.4;
    protected static double HEALAMT_IR = 0.0;
    protected static double DAMAGEBUFF_IR = 0.0;
    protected static double BASICMULTI_IR = 0.05;
    protected static double SPECIALMULTI_IR = 0.1;
    protected static double ULTMULTI_IR = 0.15;
    protected static double EXTRADAMAGE_IR = 1.5;
    protected static double ADDEDCRITCHANCE_IR = 2.5;
    protected static double SHIELDDMG_IR = 4.5;

    protected String lvlType = "pl"; // per level
    protected String ascType = "pa"; // per ascension

    protected int fixedHP;
    protected int hp;
    protected int dmg;
    protected double critChance;
    protected double critBoost;
    protected double defense;
    protected double basicMulti;
    protected double specialMulti;
    protected double ultMulti;
    protected double damageRange;
    protected double addedCritChance;
    protected double shieldDamage;
    protected double hpPercentage;
    protected double skillDamageMultiplier;

    protected int energy;
    protected Enemies[] ET;
    protected int enemySize = EnemyTeam.getEnemyTeam().length-1;
    protected boolean critical;

    protected Random r = new Random();

    protected int[] target(int targetAmount, int target) {
        int enemySize = EnemyTeam.getEnemyTeam().length - 1;
        if (targetAmount == 1) {
            int[] targets = new int[]{target};
            return targets;
        } else if (targetAmount == 3) {
            int[] targets;
            if (target == enemySize) {
                targets = new int[]{enemySize - 1, enemySize};
            } else if (target == 0) {
                targets = new int[]{0, 1};
            } else {
                targets = new int[]{target - 1, target, target + 1};
            }
            return targets;
        } else if (targetAmount == enemySize) {
            int[] targets = new int[enemySize];
            for (int i = 0; i < enemySize; i++) {
                targets[i] = i;
            }
            return targets;
        } else {
            return null;
        }
    }

    protected boolean critical(double critChance, double addedCritChance) {
        return r.nextInt(100) + 1 <= critChance + addedCritChance;
    }

    public abstract void basicAttack(int target);

    public abstract void specialAttack(int target);

    public abstract void ultimateAttack(int target);

    public abstract void attacked(int damage);

    protected int calcDMG(double skillMultiplier) {
        double dmgRNG = Math.floor(r.nextDouble() * damageRange + dmg);
        return (int) Math.floor(critical ? skillMultiplier * (dmgRNG * (critBoost / 100)) : skillMultiplier * (dmgRNG + (level * DAMAGE_IR)));
    }

    protected int calcShieldDMG(double skillMultiplier) {
        double shieldDMG = shieldDamage;
        return (int) Math.floor(critical ? skillMultiplier * (shieldDMG * (critBoost / 100)) : skillMultiplier * (shieldDMG + (level * SHIELDDMG_IR)));
    }

    protected double calcStats(double base, double IR, String type) {
        return Math.floor(type.equals(lvlType) ? base + (level * IR) : type.equals(ascType) ? base + (asc * IR) : -1);
    }

    public int getHp() {
        return hp;
    }

    public double getDefense() {
        return defense;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
