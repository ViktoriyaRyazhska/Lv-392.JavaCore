package ua.com.lozinska.lesson10.task1;

import ua.com.lozinska.lesson10.task1.MyThreads;

public class ThreadsRun {
    public static void main(String[] args) throws Exception {
        Thread t1 = new MyThreads("Thread 1 is working!");
        Thread t2 = new MyThreads("Thread 2 is working!");
        Thread t3 = new MyThreads("Thread 3 is working!");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.run();

        System.out.println("Finish");
    }
}

