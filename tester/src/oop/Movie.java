package oop;

public class Movie {
	private String title;
	private String studio; 
	private String rating; 
	
	Movie(String title, String studio, String rating){
		this.title = title;
		this.studio = studio;
		this.rating = rating;
	}
	Movie(String title, String rating){
		this.title = title;
		this.studio =""; 
		this.rating = "PG";
	}
	public String getRating() {
		return rating;
	}
	public String getTitle() {
		return title;
	}
	public String getStudio() {
		return studio;
	}
	
	public static Movie[] getPG(Movie[] arrMovies) {
	    int noPGm = 0;
	    for (Movie movie : arrMovies) {
	        if(movie.getRating().equals("PG")) {
	        	noPGm++;
	        }
	    }
	    Movie[] pgRated = new Movie[noPGm];
	    int index = 0;
	    for (Movie movie : arrMovies) {
	        if(movie.getRating().equals("PG")) {
	        	pgRated[index] = movie;
	            index++;
	        }
	    }
	    return pgRated;
	}

}
