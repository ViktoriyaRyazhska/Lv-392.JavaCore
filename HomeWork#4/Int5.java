package myPack;
import java.io.*;
import java.util.Arrays;
public class Int5 {
		public static void main(String[]args) throws NumberFormatException, IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n [] = new int [5];
			System.out.println("Enter 5 integer numbers:");
			for(int i = 0; i<n.length; i++) {
				n[i] = Integer.parseInt(br.readLine());
				if(n[i] < 0) {
					break;
				}			
			}  
			System.out.println(Arrays.toString(n));
			int count = 0;
			int min = n[0];
			int index = 0;
			int prod = 1;
			for (int i = 0; i < n.length; i++) {
				if (n[i] > 0) {
					count++;
					if (count == 2) {
					System.out.println("The position of the second positive number is " + i);
				}
				}
				if (n[i] < min) {
					min = n[i];
					index = i;
				}
				if (n[i] % 2 == 0) {
					prod *= n[i];
				}
			}
			System.out.println("The minimum = " +min+ " its position in the array is "+index);
			System.out.println("The product of even numbers = " + prod);
		}		
	}


