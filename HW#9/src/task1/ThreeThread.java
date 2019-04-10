package task1;

public class ThreeThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("I am " + Thread.currentThread().getName());
		}

	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreeThread());
		Thread t2 = new Thread(new ThreeThread());
		Thread t3 = new Thread(new ThreeThread());
		t1.start();
		t2.start();

		try {
			t2.join();
		} catch (InterruptedException e) {
			System.out.println("Thread join was Interrupted!");
		}

		t3.start();

//		We should not do like that :)

//		try {
//			Thread.sleep(300);
//			t3.start();
//		} catch (InterruptedException e) {
//			System.out.println("Thread join was Interrupted!");
//		}

		
//		Third thread is main in this case:

//		try {
//			t1.join();
//			t2.join();
//		} catch (InterruptedException e) {
//			System.out.println("Thread join not worked!");
//		}
//		for (int i = 0; i < 5; i++) {
//			System.out.println("I am " + Thread.currentThread().getName());
//		}

	}

}
