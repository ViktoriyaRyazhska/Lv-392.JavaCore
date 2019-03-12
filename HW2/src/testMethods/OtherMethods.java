package testMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OtherMethods {

        public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {


        boolean b1 = false;
        boolean b2 = false;
        try{
            b1 = OtherMethods.isNumber(br.readLine());
            b2 = OtherMethods.numeralOrNot(br.readLine());
        } catch(IOException e) {
            e.printStackTrace();
        }
        System.out.printf("b1 = %s\n", b1);
        System.out.printf("b2 = %s\n", b2);


    }


    /**
     *
     * @param str
     * @return
     */
    public static boolean isNumber(String str) {
        System.out.println("Enter text line:");
        if(str != null || str.isEmpty()) {
            for(int i = 0; i < str.length(); i++) {
                if(!Character.isDigit(str.charAt(i))) {
                    System.out.println("this is a line text");
                    return false;
                }
            }
        }
        System.out.println("this is a line digits");
        return true;
    }

    /**
     * his methods for:
     * How to determine if a string is a number?
     * To check double numbers
     * @param str String line
     * @return
     */
    public static boolean numeralOrNot(String str) {
        System.out.println("Enter text line:");
        if(str != null || str.isEmpty()) {
            System.out.println("This line isn't empty!");
            return false;
        }
        int pointCount = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '.') {
                pointCount++;
            }
            if(Character.isDigit(str.charAt(i)) && str.charAt(i) != '.' && str.charAt(i) != '-' || pointCount > 1) {
                System.out.println("This line has number with floating point!");
                return false;
            }
        }
        System.out.println("This I don't know!");
        return true;
    }
}
