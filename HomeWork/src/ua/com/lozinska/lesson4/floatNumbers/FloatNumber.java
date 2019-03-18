package ua.com.lozinska.lesson4.floatNumbers;

public class FloatNumber {


    public static boolean checkNumber(float num1, float num2, float num3) {

        System.out.println("Number 1 = " + num1 + "; Number 2 = " + num2 + "; Number 3 = " + num3);

        if (((num1 >= -5) && (num1 <= 5)) && ((num2 >= -5) && (num2 <= 5)) && ((num3 >= -5) && (num3 <= 5))) {

            System.out.println("All float numbers belong to the range [-5; 5].");
            return true;
        } else {
            System.out.println("Not all float numbers belong to the range [-5; 5].");
            return false;
        }

    }
}
