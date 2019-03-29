package ua.com.lozinska.lesson8.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceForRefactor {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the sentence: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();

        String pattern = "[ ]{2,}";
        String space = "[ ]{1}";
        String text = sentence;

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        while (m.find()) {
            text = text.replaceAll(pattern, " ");

        }
        System.out.println();
        System.out.println("Text after changes:");
        System.out.print(text);
    }
}
