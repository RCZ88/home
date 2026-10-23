package oop;

public class Staff {
	private String name;
	private String role;
	private boolean busy;
	
	Staff(String name, String role){
		this.name = name;
		this.role = role;
	}
	
	public void assignTask(String task) {
		busy = true;
	}
	public void taskDone() {
		busy = false;
	}
	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}
	public boolean isBusy() {
		return busy;
	}
	
}
