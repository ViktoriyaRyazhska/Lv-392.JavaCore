package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle extends GeometricFigure {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int numbOperation = 0;
    public static double area = 0;
    public static double perimeter = 0;


    /**
     *
     * @param numberOperation
     * @param r - is a radius or diameter
     * @return
     */
    public static double circleArea(int numberOperation, int r) {
        if(numberOperation == 1) {
            area = (Math.PI * Math.pow(r, 2)) / 2D;
        } else if(numberOperation == 2) {
            area = (Math.PI * Math.pow(r, 2)) / 4D;
        } else{
            circleArea(numberOperation, r);
        }
        return area;
    }

    public static double circleArea(int numberOperation, double r) {
        if(numberOperation == 1) {
            area = (Math.PI * Math.pow(r, 2)) / 2D;
        } else if(numberOperation == 2) {
            area = (Math.PI * Math.pow(r, 2)) / 4D;
        } else {
            circleArea(numberOperation, r);
        }
        return area;
    }

    public static double circlePerimeter(int numberOperation, int r){
        if(numberOperation == 1) {
            perimeter = (double) 2 * Math.PI * r;
        } else if(numberOperation == 2){
            perimeter = Math.PI * (double) r;
        } else{
            circlePerimeter(numberOperation, r);
        }
        return perimeter;
    }

    public static double circlePerimeter(int numberOperation, double r) {
        if (numberOperation == 1) {
            perimeter = (double) 2 * Math.PI * r;
        } else if(numberOperation == 2) {
            perimeter = Math.PI * r;
        } else {
            circlePerimeter(numberOperation, r);
        }
        return perimeter;
    }

    public static int numberOperation() {
        System.out.println("Enter 1.radius 2.diameter");
        int n = input();
        if(n == 1) {
            System.out.println("1 radius");
            return n;
        } else if(n == 2) {
            System.out.println("2 diameter");
            return n;
        } else if(Character.isDigit(n) == false) {
            numberOperation();
            return numbOperation;
        }
        else{
            numberOperation();
            return numbOperation;
        }
    }
/*
    public static int input(){
        try {
            numbOperation = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numbOperation;
    }
*/

    public static int input(){
        try {
            numbOperation = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numbOperation;
    }



    public static void showArea(double area) {
        System.out.printf("area circle = %,.3f\n", area);
    }

    public static void showPerimetr(double perimeter) {
        System.out.printf("perimeter circle = %,.3f\n", perimeter);
    }

}
