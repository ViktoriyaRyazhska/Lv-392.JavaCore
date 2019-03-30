package homework_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThirdTask {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the sentence with US : ");
        String str = br.readLine();

        Pattern p = Pattern.compile("\\$\\d+\\.\\d{2}");
        Matcher m = p.matcher(str);
        while(m.find()){
            System.out.println(str.substring(m.start(), m.end()));
        }
    }
}
