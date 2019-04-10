package task3;

public class OneTwoThread {

	public static void main(String[] args) {

		Thread one = new Thread() {
			public void run() {

				Thread two = new Thread() {
					public void run() {
						for (int i = 0; i < 3; i++) {
							System.out.println("Thread number two");
						}
						Thread three = new Thread() {
							public void run() {
								for (int i = 0; i < 5; i++) {
									System.out.println("Thread number three");
								}
							}
						};
						three.start();
					}
				};
				two.start();
			}
		};
		one.start();

	}

}
