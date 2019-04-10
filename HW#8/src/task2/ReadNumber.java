package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadNumber {

	public static List<Integer> readNum(int start, int end) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> arr = new ArrayList<Integer>();
		System.out.println("Put 10 integer numbers in range 1 - 100");
		int number;
		
			for (int i = 0; i < 10; i++) {
				try {
				number = Integer.parseInt(br.readLine());
				if (number >= start && number <= end) {
					arr.add(number);
				} else {
					try {
						throw new Exception("U put number not in range!");
					} catch (Exception e) {
						e.printStackTrace();
					}
				} 
				}catch (NumberFormatException | IOException e) {
					System.out.println("Invalid number or not a number " + e.getMessage().replace("For input string: ", ""));
				}
			}
		return arr;

	}

	public static void main(String[] args) {

		System.out.println(readNum(1, 100));

	}
}