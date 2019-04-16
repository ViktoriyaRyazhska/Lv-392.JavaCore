package ua.com.lozinska.taskN.taskN4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoudLetters {
    public static void getLoudLetters()  throws IOException {
        System.out.println("4. Input string and calculate number " +
                "of loud letters (e.g. word: “My test text”, result: 3)");

        System.out.println("Enter the sentence: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();

        int loudLetter = 0;

        String pattern = "[aeiou]";
        String text = sentence;

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        while (m.find()) {
            loudLetter = loudLetter + 1;
        }
        System.out.println("Number of loud letters in this sentence = " + loudLetter);
    }
}
