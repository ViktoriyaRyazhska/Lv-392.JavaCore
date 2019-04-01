package ua.com.lozinska.additionalList1.task3;

public class CountSum {
    public static void main(String[] args) {

        // Неповна умова задачі, тому, припускаємо, що b(i)=b=1

        int sum = 0;
        int b = 1;
        for (int i = 1; i < 30; i++) {
            if (i % 2 == 1) {
                sum = sum + (i - b) * (i - b);
            } else {
                sum = sum + (i / 2 - b) * (i / 2 - b);
            }
        }
        System.out.println("Sum = " + sum);
    }
}
