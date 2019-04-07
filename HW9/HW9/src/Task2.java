import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task2 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static ArrayList<Integer> readNumber(int start, int end) throws Exception {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println("Enter 10 numbers :");	
		for (int i = 0; i < 10; i++) {					
			try {
				int a = Integer.parseInt(br.readLine());			
				if (a < 1 || a > 100) {
					throw new Exception("The number is Wrong, try one more time!!");
				}else {
					arr.add(a);
				}	
			}catch(NumberFormatException e) {
				System.out.println("This is string! ");	
			} catch (Exception  e) {
				e.printStackTrace();
				e.getMessage();
			}		
		
	}
		return arr;
}	
	public static void main(String[] args) throws Exception{
				System.out.println(readNumber(1, 100));
	}
}
