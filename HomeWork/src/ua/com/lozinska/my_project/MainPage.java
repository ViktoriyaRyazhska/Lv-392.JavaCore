package ua.com.lozinska.my_project;

import java.util.ArrayList;
import java.util.List;

public class MainPage {

    public static void main(String[] args) {
        List<Movie> myMovies = new ArrayList<>();
        myMovies.add(new Movie(2018, "Movie1", MovieGenre.COMEDY,
                3, 0, "Description"));
        myMovies.add(new Movie(2018, "Movie2", MovieGenre.COMEDY,
                4, 0, "Description"));
        myMovies.add(new Movie(2019, "Movie3", MovieGenre.HORROR,
                5, 0, "Description"));
        myMovies.add(new Movie(2017, "Movie4", MovieGenre.DRAMA,
                5, 0, "Description"));
        myMovies.add(new Movie(2019, "Movie5", MovieGenre.DRAMA,
                5, 0, "Description"));

        while (true) {
            System.out.println("Main menu:");
            System.out.println("Searching movie by:");
            System.out.println("1. Year:");
            System.out.println("2. Movie name:");
            System.out.println("3. Genre:");
            System.out.println("4. Rating:");
            System.out.println("0. Exit:");
            System.out.println("Please, make your choice! Input number:");

            switch (ConsoleInput.enterString()) {
                case "1":
                    SearchingMovie.searchByYear(myMovies);
                    break;
                case "2":
                    SearchingMovie.searchByName(myMovies);
                    break;
                case "3":
                    SearchingMovie.searchByGenre(myMovies);
                    break;
                case "4":
                    SearchingMovie.searchByRating(myMovies);
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Wrong input information!");
                    System.out.println("Please, enter integer number: 1 or 2 or 3 or 4 or 0.");
            }
        }
    }
}

