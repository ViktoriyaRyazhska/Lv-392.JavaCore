package tasks;

public class Task12 {

    public static void numbers() {
        int sum = 0;
        for (int i = 1000; i >= 0; i--){
            if ((i % 3 == 0) || (i % 5 == 0)){
                sum += i;
            }
        }
        System.out.println("Sum of numbers below 1000 which are multiplies of 5 and 3 = " + sum);
    }
}
