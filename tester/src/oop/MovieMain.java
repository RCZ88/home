package oop;
public class MovieMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie = new Movie("Casino Royale", "Eon Productions", "PG");
		System.out.println("Title: " + movie.getTitle());
		System.out.println("Rating: "+ movie.getRating());
		Movie[] movies = {
                new Movie("Inception", "Warner Bros", "PG"),
                new Movie("Frozen", "Disney", "PG"),
                new Movie("The Matrix", "Warner Bros", "R"),
                new Movie("Finding Nemo", "Pixar", "G")
        };

        // Get an array of movies with rating "PG"
        Movie[] pgMovies = Movie.getPG(movies);

        // Print information about movies with rating "PG"
        System.out.println("\nMovies with Rating 'PG':");
        for (Movie pgMovie : pgMovies) {
            System.out.println("Title: " + pgMovie.getTitle() + ", Studio: " + pgMovie.getStudio() + ", Rating: " + pgMovie.getRating());
        }
	}

}
