package homework_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FirstTask {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the sentence of five words : ");
        String str = br.readLine();

        String [] arr = str.split(" ");

        if (arr.length != 5){
            System.out.println("Your sentence contains wrong amount of words.");
        }else{
            String maxWord = longestString(arr);
            System.out.println("The longest word is : " + maxWord);
            System.out.println("It contains " + maxWord.length() + " letters.");

            StringBuilder builder = new StringBuilder(arr[1]);
            System.out.println(builder.reverse());
        }
    }

    public static String longestString(String [] arr){
        String maxWord = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (maxWord.length() < arr[i].length()){
                maxWord = arr[i];
            }
        }
        return maxWord;
    }
}
