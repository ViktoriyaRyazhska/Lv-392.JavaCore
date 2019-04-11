package ua.com.lozinska.lesson10.task1;

public class MyThreads extends Thread {
    private String message;

    public MyThreads(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
        }
    }
}
