package game;

public class BlackSwan extends Heroes {
    BlackSwan(int level) {
        this.level = level;
        this.asc = (int) Math.floor(level / 10);
        this.CT = new CombatType().new WindType();
        this.level = level;
        this.asc = (int) Math.floor(level / 10);
        this.CT = new CombatType().new WindType();
        this.baseHp = 200;  // Compared to other heroes, Blackswan has a lower health pool
        this.baseDamage = 70.0;  // She boasts high base damage
        this.baseCritChance = 30.0;  // Her strength lies in critical hits
        this.baseCritBoost = 180.0;  // She benefits greatly from critical hits
        this.baseDefense = 7.0;  // Her defense provides some protection
        this.baseHealAmount = 0;  // She cannot heal
        this.baseDamageBuff = 0.0;  // No damage buff abilities
        this.baseExtraDamage = 100;  // Additional damage from her abilities
        this.baseAddedCritChance = 0.0;  // Base added critical chance
        this.baseShieldDamage = 20;  // She can deal shield damage

        // Multiplier from base damage to skill
        this.baseBasicMulti = 1.2;  // Multiplier for basic attack
        this.baseSpecialMulti = 1.8;  // Multiplier for special attack
        this.baseUltMulti = 2.6;  // Multiplier for ultimate attack

        // Increasement Rate
        Heroes.HP_IR = 3.5;  // Compared to other heroes, her health pool increases slightly slower
        Heroes.DAMAGE_IR = 5.0;  // She benefits greatly from increased damage
        Heroes.DEFENSE_IR = 0.4;  // Her defense increases at a steady rate
        Heroes.CRITCHANCE_IR = 0.35;  // She has a slightly increased critical chance
        Heroes.CRITBOOST_IR = 4.5;  // Her critical damage bonus increases slightly faster
        Heroes.HEALAMT_IR = 0.0;  // She does not have healing abilities
        Heroes.DAMAGEBUFF_IR = 0.0;  // No damage buff increase rate
        Heroes.BASICMULTI_IR = 0.05;  // Unchanged basic attack multiplier increase rate
        Heroes.SPECIALMULTI_IR = 0.1;  // Unchanged special attack multiplier increase rate
        Heroes.ULTMULTI_IR = 0.15;  // Unchanged ultimate attack multiplier increase rate
        Heroes.EXTRADAMAGE_IR = 1.5;  // Unchanged extra damage increase rate
        Heroes.ADDEDCRITCHANCE_IR = 2.5;  // Unchanged added critical chance increase rate
        Heroes.SHIELDDMG_IR = 4.5;  // Unchanged shield damage increase rate

        this.lvlType = "pl";
        this.ascType = "pa";

        this.fixedHP = (int) calcStats(baseHp, HP_IR, lvlType);
        this.hp = (int) calcStats(baseHp, HP_IR, lvlType);
        this.dmg = (int) calcStats(baseDamage, DAMAGE_IR, lvlType);
        this.critChance = calcStats(baseCritChance, CRITCHANCE_IR, lvlType);
        this.critBoost = calcStats(baseCritBoost, CRITBOOST_IR, ascType);
        this.defense = calcStats(baseDefense, DEFENSE_IR, lvlType);
        this.basicMulti = calcStats(baseBasicMulti, BASICMULTI_IR, ascType);
        this.specialMulti = calcStats(baseSpecialMulti, SPECIALMULTI_IR, ascType);
        this.ultMulti = calcStats(baseUltMulti, ULTMULTI_IR, ascType);
        this.damageRange = calcStats(baseExtraDamage, EXTRADAMAGE_IR, lvlType) + dmg;
        this.addedCritChance = calcStats(baseAddedCritChance, ADDEDCRITCHANCE_IR, ascType);
        this.shieldDamage = calcStats(baseShieldDamage, SHIELDDMG_IR, ascType);
        this.hpPercentage = hp / fixedHP * 100;

        this.energy = 0;

        this.ET = EnemyTeam.getEnemyTeam();
        this.critical = critical(critChance, critBoost);
        
    }

    @Override
    public void basicAttack(int target) {
        // Implement the specific logic for BlackSwan's basic attack
    	critical = critical(critChance, critBoost);
		int damage = calcDMG(basicMulti);
		int shieldDamage = calcShieldDMG(basicMulti);
		int [] t = target(1,target);
		if(team.getSP()<=5) {
			team.increaseSP();
		}
		for(int i = 0; i<t.length; i++) {
			if(ET[target] instanceof Boss) {
				Boss boss = (Boss) ET[target];
				boss.attacked(damage, shieldDamage, CT);
			}else if(ET[t[i]] instanceof Minion) {
				Minion minion = (Minion) ET[target];
				minion.attacked(damage,shieldDamage);
			}else if(ET[t[i]] instanceof Wizard) {
				Wizard wizard = (Wizard) ET[target];
				wizard.attacked(damage, shieldDamage);
			}
		}
		if(energy<100) {
			energy+=20;
		}
		if(energy>100) {
			energy = 100;
		}
    }

    @Override
    public void specialAttack(int target) {
        // Implement the specific logic for BlackSwan's special attack
    	addedCritChance += 15;
		final int fixedDamage = calcDMG(specialMulti);
		int damage = fixedDamage;
		int shieldDamage = calcShieldDMG(basicMulti);
		int [] t = target(3,target);
		if(team.getSP()>=1) {
			for(int i = 0; i<t.length; i++) {
				if(i == (int)(Math.ceil(t.length/2))) {
					damage = (int) (fixedDamage*1.5);
				}else{
					damage = fixedDamage;
				}
				if(ET[t[i]] instanceof Boss) {
					Boss boss = (Boss) ET[target];
					boss.attacked(damage, shieldDamage, CT);
				}else if(ET[t[i]] instanceof Minion) {
					Minion minion = (Minion) ET[target];
					minion.attacked(damage, shieldDamage);
				}else if(ET[t[i]] instanceof Wizard) {
					Wizard wizard = (Wizard) ET[target];
					wizard.attacked(damage,shieldDamage);
				}
			}
			
			if(energy<100) {
				energy+=25;
			}
			if(energy>100) {
				energy = 100;
			}
		}else {
			System.out.println("Issuficient Skill Points!");
		}
		addedCritChance -= 15;
    }

    @Override
    public void ultimateAttack(int target) {
    	addedCritChance += 15;
		int damage = calcDMG(ultMulti);
		int shieldDamage = calcShieldDMG(ultMulti);
		int [] t = target(enemySize,target);
		if(energy == 100) {
			for(int i = 0; i<t.length; i++) {
				if(ET[t[i]] instanceof Boss) {
					Boss boss = (Boss) ET[target];
					boss.attacked(damage, shieldDamage, CT);
				}else if(ET[t[i]] instanceof Minion) {
					Minion minion = (Minion) ET[target];
					minion.attacked(damage, shieldDamage);
				}else if(ET[t[i]] instanceof Wizard) {
					Wizard wizard = (Wizard) ET[target];
					wizard.attacked(damage, shieldDamage);
				}
			}	
			energy = 0;
		}else {
			System.out.println("Issuficient Energy");
		}
		addedCritChance -= 15;
    }

    @Override
    public void attacked(int damage) {
        hp -= ((100 - defense) / 100) * damage;
    }
}
