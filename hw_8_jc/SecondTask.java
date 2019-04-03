package homework8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SecondTask {
    public static void main(String[] args) {
        System.out.println(readNumber(1, 100));
    }

    public static ArrayList readNumber(int start, int end){
        ArrayList arr = new ArrayList();
        System.out.println("Enter ten numbers : ");
        for (int i = 0; i < 10; i++) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int number = Integer.parseInt(br.readLine());

                if (number >= start && number <= end){
                    arr.add(number);
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return arr;
    }
}
