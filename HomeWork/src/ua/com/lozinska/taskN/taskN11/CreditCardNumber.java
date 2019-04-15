package ua.com.lozinska.taskN.taskN11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CreditCardNumber {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the card number: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cardNumber = br.readLine();

        if ((cardNumber.length() < 13) || (cardNumber.length() > 19)) {
            System.out.println("Wrong card number!");
        } else {
            List<String> creditCardNumbers = new ArrayList<>();
            for (int i = 0; i < cardNumber.length(); i++) {
//creditCardNumbers.add(i,);
            }
        }
    }
}
