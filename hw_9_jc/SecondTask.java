package hw_9_jc;

// не знаю як зробити це завдання :(

public class SecondTask {
    public final static Object first = new Object();
    public final static Object second = new Object();

    public static void main(String s[]) {
        Thread t1 = new Thread() {
            public void run() {
                synchronized (first) {
                    Thread.yield();
                    synchronized (second) {
                        System.out.println("Success!");
                    }
                }synchronized (first){
                    first.notifyAll();
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (second) {
                    Thread.yield();
                    synchronized (first) {
                        System.out.println("Success!");
                    }

                }
                synchronized (second){
                    second.notifyAll();
                }
            }
        };

        t1.start();
        t2.start();

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.getMessage();
        }
        System.exit(0);
    }
}


