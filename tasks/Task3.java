package tasks;

import java.util.Scanner;

public class Task3 {

    public static void getBuyDollars() { ;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the cost of dollar: ");
        double dollarCost = scan.nextDouble();
        System.out.println("Please enter the sum of money in grivna: ");
        double sumGrivna = scan.nextDouble();

        int buyDollars = (int) (sumGrivna / dollarCost);
        double change = sumGrivna - (buyDollars * dollarCost);

        String format = "%.2f";
        String getChange = String.format(format, change);
        System.out.println("You can buy " + buyDollars + " dollars and your change = " + getChange);

    }
}
