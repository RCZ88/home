package oop;

public class Movie1 {
	private String title;
	private String studio;
	private String rating;
	
	Movie1(String title, String studio, String rating){
		this.title = title;
		this.studio = studio;
		this.rating = rating;
	}
	Movie1(String title, String studio){
		this.title = title;
		this.studio = studio;
		this.rating = "PG";
	}
}
