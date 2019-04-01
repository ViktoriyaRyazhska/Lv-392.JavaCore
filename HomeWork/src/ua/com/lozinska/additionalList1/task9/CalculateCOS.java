package ua.com.lozinska.additionalList1.task9;

public class CalculateCOS {
    public static void main(String[] args) {
        double y = 39 + Math.cos(40);

        for (int i = 39; i > 0 ; i--) {
            y = i-1+Math.cos(y);
        }
        System.out.println("The value of expression = " + y);
    }
}
