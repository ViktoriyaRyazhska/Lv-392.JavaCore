package ua.com.lozinska.lesson8.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sentence {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter the sentence: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();

        String[] arrayWords = sentence.split(" ");

        String maxLengthWord = arrayWords[0];
        for (int i = 0; i < arrayWords.length; i++) {
            if (arrayWords[i].length() > maxLengthWord.length()) {
                maxLengthWord = arrayWords[i];
            }
        }
        System.out.println("The longest word is: " + maxLengthWord + "; It's length is: " +
                maxLengthWord.length());

        System.out.println();
        System.out.println("Reversing Second word!!");
        String secondWord = arrayWords[1];
        StringBuilder sb = new StringBuilder(secondWord);
        sb.reverse();
        String secondWordReverse = sb.toString();
        System.out.println("Second word before reverse: " + secondWord);
        System.out.println("Second word after reverse: " + secondWordReverse);
    }

}

