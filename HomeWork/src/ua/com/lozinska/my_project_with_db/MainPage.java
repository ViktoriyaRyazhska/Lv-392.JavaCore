package ua.com.lozinska.my_project_with_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainPage {

    public static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/movie_db?useSSL=false&serverTimezone=UTC";
    public static final String USER = "root";
    public static final String PASSWORD = "1111";

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(CONNECTION_URL, USER, PASSWORD)) {
            SearchingMovie.createTable(connection);
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
                        SearchingMovie.searchByYear(connection);
                        break;
//                    case "2":
//                        SearchingMovie.searchByName(connection);
//                        break;
//                    case "3":
//                        SearchingMovie.searchByGenre(connection);
//                        break;
//                    case "4":
//                        SearchingMovie.searchByRating(connection);
//                        break;
                    case "0":
                        System.exit(0);
                    default:
                        System.out.println("Wrong input information!");
                        System.out.println("Please, enter integer number: 1 or 2 or 3 or 4 or 0.");
                }
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

