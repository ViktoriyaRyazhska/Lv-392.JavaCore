package myPack;
import java.io.*;
public class NumberOfmonth {	
		public static void main(String[]args) throws NumberFormatException, IOException  {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int m [] = new int[13];
			m [0] = 0;
			m [1] = 31;
			m [2] = 28;
			m [3] = 31;
			m [4] = 30;
			m [5] = 31;
			m [6] = 30;
			m [7] = 31;
			m [8] = 31;
			m [9] = 30;
			m [10] = 31;
			m [11] = 30;
			m [12] = 31;
		    System.out.println("Enter the number of month:");
			int n = Integer.parseInt(br.readLine());
			System.out.println(m[n]);
			}
		}

