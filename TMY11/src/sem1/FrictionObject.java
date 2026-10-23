package sem1;

public class FrictionObject {
	private double weight;
	private double FK;//Kinetic Friction
	private double FS;//Static Friction
	public FrictionObject(double weight, double ms, double mk) {
		this.weight = weight;
		FK = mk * weight;//μk
		FS = ms * weight;//μs
	}
	public double getFriction(double forceApplied) {
		double staticFriction = getStaticFriction(forceApplied);
		if(staticFriction == 0) {
			return FK;
		}else {
			return staticFriction;
		}
	}
	public double getStaticFriction(double forceApplied) {
		double sf = 0;
		if(forceApplied > FS) {
			sf = forceApplied;
		}
		return sf;
	}
	public double getKineticFriction(double forceApplied) {
		double kf = 0;
		if(getStaticFriction(forceApplied) != 0) {
			kf = FK;
		}
		return kf;
	}
	public double getFNet(double forceApplied) {
		if(getStaticFriction(forceApplied) == 0) {
			return 0;
		}
		return forceApplied - FK;
	}
}
