package homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FirstTask {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter the radius, please : ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int radius = Integer.parseInt(br.readLine());

        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;

        System.out.println("the perimeter is " + perimeter + "\n" + "the area is " + area);

    }
}