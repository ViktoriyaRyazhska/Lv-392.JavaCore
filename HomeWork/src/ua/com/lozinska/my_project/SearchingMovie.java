package ua.com.lozinska.my_project;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchingMovie {

    public static void searchByYear(List<Movie> myMovies) {
        int movieYearInput;

        System.out.println("Searching movie by year:");
        System.out.println("Please, make your choice! Enter the year of movie production:");
        System.out.println("To finish the operation, input 0.");

        movieYearInput = ConsoleInput.enterInt();
        if (movieYearInput == 0) {
            return;
        }

        List<Movie> filteredMovies = new ArrayList<>();
        for (Movie myMovie : myMovies) {
            if (myMovie.getMovieYear() == movieYearInput) {
                filteredMovies.add(myMovie);
            }
        }
        if (filteredMovies.isEmpty()) {
            System.out.println("Movies with selected year [" + movieYearInput + "]not found");
            System.out.println();
        } else {
            for (Movie movie : filteredMovies) {
                System.out.println(movie);
            }
            System.out.println();
        }
    }

    public static void searchByName(List<Movie> myMovies) {

        String movieNameInput;
        System.out.println("Searching movie by name:");
        System.out.println("Please, input the name of movie:");
        System.out.println("To finish the operation, input 0.");

        movieNameInput = ConsoleInput.enterString();

        if (movieNameInput.equals("0")) {
            return;
        }

        Pattern p = Pattern.compile(movieNameInput);
        Movie filteredMovie = null;
        for (Movie myMovie : myMovies) {
            Matcher m = p.matcher(myMovie.getMovieName());

            if (m.find()) {
                filteredMovie = myMovie;
            }
        }

        if (filteredMovie == null) {
            System.out.println("Movie with selected name [" + movieNameInput + "] not found");
            System.out.println();
            return;
        } else {
            System.out.println(filteredMovie);
            System.out.println();
        }

        System.out.println("If you want to rate the movie, input 1, to exit, input 0.");
        switch (ConsoleInput.enterString()) {
            case "1":
                setRating(filteredMovie);
                break;
            case "0":
                return;
        }
    }

    public static void searchByGenre(List<Movie> myMovies) {

        System.out.println("Searching movie by genre:");
        System.out.println("Please, make your choice! Input genre: COMEDY, DRAMA, or HORROR:");
        System.out.println("To finish the operation, input 0.");

        String input = ConsoleInput.enterString();
        if (input.equals("0")) {
            return;
        }

        try {
            MovieGenre movieGenre = MovieGenre.valueOf(input.toUpperCase());

            List<Movie> filteredMovies = new ArrayList<>();
            for (Movie myMovie : myMovies) {
                if (movieGenre.equals(myMovie.getMovieGenre())) {
                    filteredMovies.add(myMovie);
                }
            }

            if (filteredMovies.isEmpty()) {
                System.out.println("Movies with selected genre [" + movieGenre + "] not found");
                System.out.println();
            } else {
                for (Movie movie : filteredMovies) {
                    System.out.println(movie);
                }
                System.out.println();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Please enter a valid genre!");
        }
    }

    public static void searchByRating(List<Movie> myMovies) {

        System.out.println("Searching movie by rating:");
        System.out.println("Please, input movie rating 1..5:");
        System.out.println("To finish the operation, input 0.");

        int movieRatingInput = ConsoleInput.enterInt();

        if (movieRatingInput == 0) {
            return;
        }

        if (movieRatingInput > 5) {
            System.out.println("Please, input movie rating from 1 to 5!");
            return;
        }

        List<Movie> filteredMovies = new ArrayList<>();
        for (Movie myMovie : myMovies) {
            if (myMovie.getMovieRating() >= movieRatingInput) {
                filteredMovies.add(myMovie);
            }
        }

        if (filteredMovies.isEmpty()) {
            System.out.println("Movies with rate [" + movieRatingInput + "] or bigger not found");
            System.out.println();
        } else {
            for (Movie movie : filteredMovies) {
                System.out.println(movie);
            }
            System.out.println();
        }
    }

    public static void setRating(Movie myMovie) {
        int oldVoteCounter = myMovie.getVoteCounter();
        double oldRating = myMovie.getMovieRating();

        System.out.println("Input your rating for movie from 1 to 5: ");
        int guestRating = ConsoleInput.enterInt();
        if ((guestRating < 1) || (guestRating > 5)) {
            System.out.println("Wrong rating!");
            return;
        }

        myMovie.setMovieRating(((oldRating * oldVoteCounter) + guestRating) / (oldVoteCounter + 1));
        myMovie.setVoteCounter(oldVoteCounter + 1);

        System.out.println("New rating = " + myMovie.getMovieRating());
        System.out.println("Voters count = " + myMovie.getVoteCounter());
    }
}
