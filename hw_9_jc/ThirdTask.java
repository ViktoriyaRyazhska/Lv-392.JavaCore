package hw_9_jc;

public class ThirdTask {

    public static void main(String[] args) {
        Thread t3 = new MyThread("Third Thread.");

        Thread t2 = new MyThread("Thread number two"){
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println(message);
                }
                t3.start();
            }
        };
        Thread t1 = new Thread(){
            @Override
            public void run() {
                t2.start();
            }
        };
        t1.start();
    }
}
