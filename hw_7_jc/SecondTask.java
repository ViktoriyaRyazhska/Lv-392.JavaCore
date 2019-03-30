package homework_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondTask {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the sentence that contains the words between more than one space : ");
        String str = br.readLine();

        System.out.println(str.replaceAll("\\s+"," "));
    }
}
