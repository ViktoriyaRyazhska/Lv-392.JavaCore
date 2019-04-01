package ua.com.lozinska.additionalList1.task12;

import java.util.ArrayList;
import java.util.Scanner;

public class SportCompetitions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of judges: ");
        int n = scan.nextInt();

        ArrayList<Integer> myMarcs = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            System.out.println("Please enter the marc from " + (i + 1) + " judge: ");
            int a = scan.nextInt();
            myMarcs.add(i, a);
        }
        System.out.println("List of all marcs:");
        System.out.println(myMarcs);

        int maxMarc = 0;
        int minMarc = 10;
        int sumOfMarcs = 0;
        for (int i = 0; i < n; i++) {
            if (myMarcs.get(i) > maxMarc) {
                maxMarc = myMarcs.get(i);
            }
            if (myMarcs.get(i) < minMarc) {
                minMarc = myMarcs.get(i);
            }
            sumOfMarcs = sumOfMarcs + myMarcs.get(i);

        }
        System.out.println("Minimum marc = " + minMarc);
        System.out.println("Maximum marc = " + maxMarc);

        double averageScore = (double) (sumOfMarcs - maxMarc - minMarc) / (n - 2);

        System.out.println("Average score = " + averageScore);


    }
}
