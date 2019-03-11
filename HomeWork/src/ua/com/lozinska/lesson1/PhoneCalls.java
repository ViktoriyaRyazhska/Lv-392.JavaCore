package ua.com.lozinska.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCalls {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input first country please.");
        String c1 = br.readLine();
        System.out.println("Input talking minutes for " + c1 + " please.");
        int t1 = Integer.parseInt(br.readLine());

        System.out.println("Input second country please.");
        String c2 = br.readLine();
        System.out.println("Input talking minutes for " + c2 + " please.");
        int t2 = Integer.parseInt(br.readLine());

        System.out.println("Input third country please.");
        String c3 = br.readLine();
        System.out.println("Input talking minutes for " + c3 + " please.");
        int t3 = Integer.parseInt(br.readLine());

        System.out.println(c1 +" continued talks in " + t1 + " minutes.");
        System.out.println(c2 +" continued talks in " + t2 + " minutes.");
        System.out.println(c3 +" continued talks in " + t3 + " minutes.");
        System.out.println("All countries " +c1+", " +c2 + " and " + c3 + " togather continued talks in "  + (t1+t2+t3) + " minutes.");
    }
    }

