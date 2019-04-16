package ua.com.lozinska.taskN.taskN3;

import java.util.Scanner;

public class BuyDollars {
    public static void getBuyDollars() {
        System.out.println("3. Input cost of dollar and sum of money in gryvna. Calculate how many dollars user can buy and\n" +
                "change.");

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
