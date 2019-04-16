package tasks;

import java.util.Scanner;

public class Task7 {

    public static void getFuctorial() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int n = scan.nextInt();

        int result = 1;
        int i = 1;
        while (i < n) {
            result = result * i;
            System.out.print(i + " * ");
            i++;
        }
        System.out.println(i);
        System.out.println();
        System.out.println("n! = " + result*i);
    }
}
