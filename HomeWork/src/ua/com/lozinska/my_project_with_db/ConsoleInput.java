package ua.com.lozinska.my_project_with_db;

import java.util.Scanner;

public class ConsoleInput {

    private static Scanner scanner = new Scanner(System.in);

    public static String enterString() {
        return scanner.next();
    }

    public static int enterInt() {
        int i = 0;
        try {
            i = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Input a number!");
            scanner.next();
        }
        return i;
    }
}
