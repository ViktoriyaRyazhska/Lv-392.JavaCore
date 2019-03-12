package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {


        /*
        Flower bed is shaped like a circle.
        Calculate the perimeter and area by entering
        the radius. Output obtained results.
         */

/*        try{
            Circle.showArea((Circle.circleArea(Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()))));
        } catch(IOException e){
            e.printStackTrace();
        }*/

//        Circle.showArea(Circle.circleArea(Integer.parseInt(br.readLine())));

/*        try {
            Circle.numberOperation(Integer.parseInt(br.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
            int a = Circle.numberOperation();
            double d1 = Circle.circleArea(a, 25);
            Circle.showArea(d1);


            try{
                Circle.showArea(Circle.circleArea(Circle.numberOperation(), Integer.parseInt(br.readLine())));
            } catch(IOException e){
                e.printStackTrace();
            }

            GeometricFigure circle1 = new GeometricFigure();
    }
}
