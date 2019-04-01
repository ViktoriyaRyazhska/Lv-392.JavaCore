package ua.com.lozinska.additionalList1.task11;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number of costumers: ");
        int n = scan.nextInt();

        ArrayList<Integer> myCustomersServiceTimes = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            System.out.println("Please enter the customer service time for " + (i + 1) + " customer: ");
            int a = scan.nextInt();
            myCustomersServiceTimes.add(i, a);
        }

        ArrayList<Integer> customersWaitingTimes = new ArrayList<>(n);
        System.out.println("Waiting time in queue for each customer:");
        customersWaitingTimes.add(0, 0);
        System.out.println("Customer 1 = " + customersWaitingTimes.get(0));
        for (int i = 1; i < n; i++) {
            customersWaitingTimes.add(i, customersWaitingTimes.get(i - 1) + myCustomersServiceTimes.get(i - 1));
            System.out.println("Customer " + (i + 1) + " = " + customersWaitingTimes.get(i));
        }

        int minServiceTime = myCustomersServiceTimes.get(0);
        int customerNumber = 1;
        for (int i = 1; i < n; i++) {
            if (myCustomersServiceTimes.get(i) < minServiceTime) {
                minServiceTime = myCustomersServiceTimes.get(i);
                customerNumber = i + 1;
            }
        }
        if (customerNumber == 1) {
            System.out.println("Customer 1 has minimal service time: " + minServiceTime);
        } else {
            System.out.println("Customer " + customerNumber + " has minimal service time: " + minServiceTime);
        }
    }
}
