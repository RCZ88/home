package idkbruh;

import java.util.ArrayList;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data implements Serializable{
	private static final long serialVersionUID = 1L;
	private ArrayList<String>dates;
	private ArrayList<Double>income;
	private ArrayList<Double>outcome;
	private ArrayList<Double>cash;
	private ArrayList<String>notes;
	private String name;
	private boolean autoSave;

	public Data(String name) {
		this.name = name;
		dates = new ArrayList<>();
		income = new ArrayList<>();
		outcome = new ArrayList<>();
		cash = new ArrayList<>();
		notes = new ArrayList<>();
		autoSave = false;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public ArrayList<String> getDates() {
		return dates;
	}
	public ArrayList<Double> getIncome() {
		return income;
	}
	public ArrayList<Double> getOutcome() {
		return outcome;
	}
	public ArrayList<Double> getCash() {
		return cash;
	}
	public ArrayList<String> getNotes() {
		return notes;
	}
	public void addIncome(double amt) {
		income.add(amt);
	}
	public void addOutcome(double amt) {
		outcome.add(amt);
	}
	public void addNote(String note) {
		notes.add(note);
	}
	public String getName() {
		return name;
	}
	public boolean getAutoSave() {
		return autoSave;
	}
	public void setSave(boolean s) {
		autoSave = s;
	}
	public void addCash() {
		double c = 0;
		if(cash.size() == 0) {
			c = income.get(income.size()-1)-outcome.get(outcome.size()-1);
		}else {
			c = cash.get(cash.size()- 2)+income.get(income.size()-1)-outcome.get(outcome.size()-1);
		}
		cash.add(c);
		System.out.println("Balance: " + c);
	}
	public void addDate() {
		LocalDate ld = LocalDate.now();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String ds = ld.format(f);
		dates.add(ds);
	}
	public void printData() {
	    // Print header
	    System.out.printf("%-10s |%-20s |%-20s |%20s |%30s |%n", "Date", "Income", "Outcome", "Balance", "Notes");
	    
	    // Determine the size of the smallest list
	    int size = dates.size();

	    // Print data rows
	    for (int i = 0; i < size; i++) {
	        System.out.printf("%-10s |Rp.%-17.2f |Rp.%-17.2f |Rp.%17.2f |%30s |%n",
	                dates.get(i), 
	                income.get(i), 
	                outcome.get(i), 
	                cash.get(i), 
	                notes.get(i));
	    }
	}
}
