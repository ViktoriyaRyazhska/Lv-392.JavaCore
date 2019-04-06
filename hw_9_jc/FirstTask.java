package hw_9_jc;

public class FirstTask {

    public static void main(String[] args) {
        Thread t1 = new MyThread("First Thread.");
        Thread t2 = new MyThread("Second Thread.");
        Thread t3 = new MyThread("Third Thread.");

        try {
            t1.start();
            t2.start();

            t1.join();
            t2.join();

            t3.start();
        }catch (InterruptedException e){
            e.getMessage();
        }
    }
}
