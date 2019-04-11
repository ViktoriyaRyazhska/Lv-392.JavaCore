package task2;

public class Deadlock {

	public static Object lock1 = new Object();
	public static Object lock2 = new Object();

	public static void main(String[] args) {

		Thread t1 = new Thread() {
			public void run() {
				synchronized (lock1) {
					System.out.println("Thread 1 locked Object 1");
					Thread.yield();
					synchronized (lock2) {
						System.out.println("Thread 1 locked Object 2");
					}
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				synchronized (lock2) {
					System.out.println("Thread 2 locked Object 2");

					synchronized (lock1) {
						System.out.println("Thread 2 locked Object 1");
					}
				}
			}
		};
		t1.start();
		t2.start();
	}

}
