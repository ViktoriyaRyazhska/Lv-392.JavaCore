package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void getPalindrome() throws IOException {

        System.out.println("Enter the word: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        String myWord = word.toUpperCase();

        int startWord = 0;
        int endWord = myWord.length() - 1;
        boolean isPalindrome = true;

        while (startWord < myWord.length() / 2) {
            if (myWord.charAt(startWord) == myWord.charAt(endWord)) {
                startWord = startWord + 1;
                endWord = endWord - 1;
            } else {
                isPalindrome = false;
                System.out.println("This word is not a palindrome!");
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("This word is a palindrome!");
        }
    }
}
