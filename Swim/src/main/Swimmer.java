package main;

public class Swimmer implements Comparable<Swimmer> {
	private String name;
	private String school;
	private String [] eventId;
	private double [] time;
	
	public Swimmer(String name, String school) {
		this.name = name;
		this.school = school;
		eventId = new String [5];
		time = new double [5];
	}
	
	public void addTime(double time) {
		this.time[this.time.length-1] = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String[] getEventId() {
		return eventId;
	}

	public void setEventId(String[] eventId) {
		this.eventId = eventId;
	}

	public double[] getTime() {
		return time;
	}

	public void setTime(double[] time) {
		this.time = time;
	}

	@Override
	public int compareTo(Swimmer o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
}
