import java.util.Scanner;
class PhoneCalls {
	public static void main(String[] args) {
		double c1 = 1.99 , c2 = 2.99, c3 = 3.99;
		int t1, t2, t3;
		Scanner time = new Scanner(System.in);
		 System.out.println("U1, enter the duration of your call in minutes");
		 t1 = time.nextInt();
				
		 System.out.println("U2, enter the duration of your call in minutes");
		 t2 = time.nextInt();
		
		 System.out.println("U3, enter the duration of your call in minutes");
		 t3 = time.nextInt();
		 double U1 = t1 * c1, U2 = t2 * c2, U3 = t3 * c3;
		
		System.out.println("U1 your call per " + t1 + " min cost: " + U1 + " standard units");
		System.out.println("U2 your call per " + t2 + " min cost: " + U2 + " standard units");
		System.out.println("U3 your call per " + t3 + " min cost: " + U3 + " standard units");
		System.out.println("Total price : " + (U1 + U2 + U3)+ " standard units");
	}
} 