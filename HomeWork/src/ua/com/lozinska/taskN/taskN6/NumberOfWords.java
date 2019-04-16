package ua.com.lozinska.taskN.taskN6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberOfWords {
    public static void getNumberOfWords() throws IOException {
        System.out.println("6. Input text and calculate number of words in this text");

        System.out.println("Enter the sentence: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();

        int numberOfWords = 1;

        String pattern = "[ ]+";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(sentence);

        while (m.find()) {
            numberOfWords = numberOfWords + 1;
        }
        boolean startOrEnd;
        if (startOrEnd = sentence.startsWith(" ")) {
            numberOfWords = numberOfWords - 1;
        }
        if (startOrEnd = sentence.endsWith(" ")) {
            numberOfWords = numberOfWords - 1;
        }
        System.out.println("Number of words in this sentence = " + numberOfWords);
    }
}

