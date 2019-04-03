package homework8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTask {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter two double numbers : ");
            double a = Double.parseDouble(br.readLine());
            double b = Double.parseDouble(br.readLine());
            System.out.println(div(a, b));
        }catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double div(double a, double b){
        try{
            return a / b;
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
