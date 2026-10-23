package game;

public class DrRatio extends Heroes {
    DrRatio(int level, Team team) {
    	super(team);
        this.level = level;
        this.asc = (int) Math.floor(level / 10);
        this.CT = new CombatType().new ImaginaryType();
        this.baseHp = 180;  // Dr. Ratio has a decent health pool compared to other Scholars
        this.baseDamage = 40.0;  // His base attack is lower than other attackers
        this.baseCritChance = 15.0;  // His critical chance is moderate
        this.baseCritBoost = 120.0;  // His critical boost is moderate
        this.baseDefense = 15.0;  // He boasts high defense
        this.baseHealAmount = 0;  // He cannot heal
        this.baseDamageBuff = 0.0;  // No damage buff abilities
        this.baseExtraDamage = 80;  // Additional damage from his abilities
        this.baseAddedCritChance = 0.0;  // Base added critical chance
        this.baseShieldDamage = 15;  // He can deal shield damage

        // Multiplier from base damage to skill
        this.baseBasicMulti = 1.2;  // Multiplier for basic attack
        this.baseSpecialMulti = 1.5;  // Multiplier for special attack
        this.baseUltMulti = 2.0;  // Multiplier for ultimate attack

        // Increasement Rate
        Heroes.HP_IR = 3.5;  // His health pool increases slightly slower
        Heroes.DAMAGE_IR = 4.0;  // His damage increases at a steady rate
        Heroes.DEFENSE_IR = 0.5;  // His defense increases at a steady rate
        Heroes.CRITCHANCE_IR = 0.2;  // His critical chance increases at a steady rate
        Heroes.CRITBOOST_IR = 3.0;  // His critical boost increases at a steady rate
        Heroes.HEALAMT_IR = 0.0;  // He does not have healing abilities
        Heroes.DAMAGEBUFF_IR = 0.0;  // No damage buff increase rate
        Heroes.BASICMULTI_IR = 0.05;  // Unchanged basic attack multiplier increase rate
        Heroes.SPECIALMULTI_IR = 0.1;  // Unchanged special attack multiplier increase rate
        Heroes.ULTMULTI_IR = 0.15;  // Unchanged ultimate attack multiplier increase rate
        Heroes.EXTRADAMAGE_IR = 1.5;  // Unchanged extra damage increase rate
        Heroes.ADDEDCRITCHANCE_IR = 2.0;  // Slightly decreased added critical chance increase rate
        Heroes.SHIELDDMG_IR = 3.0;  // Slightly decreased shield damage increase rate

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
        // Implement the specific logic for DrRatio's basic attack
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
        // Implement the specific logic for DrRatio's special attack
    	addedCritChance += 15;
		critical = critical(critChance+addedCritChance, critBoost);
		int damage = calcDMG(specialMulti);
		int shieldDamage = calcShieldDMG(basicMulti);
		int [] t = target(1,target);
		if(team.getSP()>=1) {
			for(int i = 0; i<t.length; i++) {
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
        // Implement the specific logic for DrRatio's ultimate attack
    	addedCritChance += 25;
		int damage = calcDMG(ultMulti);
		int shieldDamage = calcShieldDMG(ultMulti);
		int [] t = target(1,target);
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
		addedCritChance -= 25;
    }

    @Override
    public void attacked(int damage) {
        hp -= ((100 - defense) / 100) * damage;
    }
}
