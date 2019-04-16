package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task13 {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void runner() throws IOException {
        System.out.println("The Smallest Multiple: " + mainNumber(br));

    }

    private static long remainderOfDivision(long digitOne, long digitTwo) {
        while (digitTwo > 0) {
            long temp = digitTwo;
            digitTwo = digitOne % digitTwo;
            digitOne = temp;
        }
        return digitOne;
    }

    public static long mainNumber(BufferedReader br) throws IOException {
        System.out.println("Enter number: ");
        long number = 1;
        int inputNumber = Integer.parseInt(br.readLine());
        for (int i = 2; i <= inputNumber; i++) {
            number = number * (i / remainderOfDivision(number, i));
//            System.out.println(number);
            System.out.printf("%1$,d = %2$,d * (%3$d / %4$,d\t\t%5$,d)\n", number, number, i, number, i);   // number = number * (i / remainderOfDivision(number, i)) :
        }
        return number;
    }
}
