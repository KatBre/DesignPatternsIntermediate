package oddexercise;

import java.util.Map;
import java.util.Scanner;

public class MoviesDatabase {
    Map<String, Movie> moviesMap;


    public void addMovies(Movie m) {
        moviesMap.put(m.getName(), m);
    }

    public Movie searchMovie(String movieName) {
        Scanner scanner = new Scanner(System.in);

        return null;
    }
}
