package homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ThirdTask {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter c1, c2, c3 : ");
        double c1 = Double.parseDouble(br.readLine());
        double c2 = Double.parseDouble(br.readLine());
        double c3 = Double.parseDouble(br.readLine());

        System.out.println("Enter t1, t2, t3 : ");
        double t1 = Double.parseDouble(br.readLine());
        double t2 = Double.parseDouble(br.readLine());
        double t3 = Double.parseDouble(br.readLine());

        System.out.println("first call : " + (c1*t1));
        System.out.println("second call : " + (c2*t2));
        System.out.println("third call : " + (c3*t3));
        System.out.println("all calls : " + ((c1*t1) + (c2*t2) + (c3*t3)));

    }
}
