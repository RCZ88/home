package game;

public class CombatType {
	//alliesType
	public class ImaginaryType extends CombatType {
		
	}
	public class WindType extends CombatType{
		
	}
	public class FireType extends CombatType{
		
	}
	public class QuantumType extends CombatType{
		
	}
	//enemyType
	public class DarkType extends CombatType{
		private CombatType [] weaknesses;
		public DarkType(){
			weaknesses = new CombatType[]{
				new ImaginaryType(),
				new WindType(),
				new FireType()
			};
		}
		public CombatType [] getWeaknesses(){
			return weaknesses;
		}
	}
	public class MoonType extends CombatType{
		private CombatType [] weaknesses;
		public MoonType(){
			weaknesses = new CombatType[]{
				new WindType(),
				new QuantumType()
			};
		}
		public CombatType [] getWeaknesses(){
			return weaknesses;
		}
	}
}
