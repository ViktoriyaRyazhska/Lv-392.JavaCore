package homework4;

import java.io.IOException;

import static homework4.Main.br;

public class FirstTask {

    public static void main(String[] args) throws IOException {
        int [] monthArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Enter the number of the month: ");
        int number = Integer.parseInt(br.readLine());

        if (number > 0 && number < 13){
            System.out.println("There are " + monthArray[number-1] + " days in " + number + " month.");
        }else{
            System.out.println("You enter the wrong month number.");
        }
    }
}
