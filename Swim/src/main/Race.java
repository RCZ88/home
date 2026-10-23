package main;


import java.util.TreeMap;

public class Race {
	private TreeMap <Swimmer, Double> placement;
	public Race() {
		placement = new TreeMap<>();
	}
	public void addPlacement(Swimmer swimmer, double time) {
		placement.put(swimmer, time);
	}
	public TreeMap<Swimmer, Double> getPlacement() {
		return placement;
	}
	public void setPlacement(TreeMap<Swimmer, Double> placement) {
		this.placement = placement;
	}
}
