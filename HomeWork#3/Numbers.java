import java.io.*;
import java.util.Arrays;
public class Numbers {
      public static void main(String[]args) throws IOException {
	  float f1;
	  float f2;
	  float f3;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("Enter your first float number ");
	  f1 = Float.parseFloat(br.readLine());
	  if (f1 >=-5.0F && f1 <= 5.0F) {
		  System.out.println("This number belongs to the range [-5,5]");
	  }else {
		  System.out.println("This number doesn't belong to the range [-5,5]");
	  }
	  System.out.println("Enter your second float number ");
	  f2 = Float.parseFloat(br.readLine());
	  if (f2 >=-5.0F && f2 <= 5.0F) {
		  System.out.println("This number belongs to the range [-5,5]");
	  }else {
		  System.out.println("This number doesn't belong to the range [-5,5]");
	  }
	  System.out.println("Enter your third float number ");
	  f3 = Float.parseFloat(br.readLine());
	  if (f3 >=-5.0F && f3 <= 5.0F) {
		  System.out.println("This number belongs to the range [-5,5]");
	  }else {
		  System.out.println("This number doesn't belong to the range [-5,5]");
	  }
		System.out.println("\nEnter three numbers:");
		BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(rb.readLine());
		int b = Integer.parseInt(rb.readLine());
		int c = Integer.parseInt(rb.readLine());
		int[] nums={a,b,c};
		Arrays.sort(nums);
		System.out.println("Min = " + nums[0]);
		System.out.println("Max = " + nums[nums.length-1]);
	  }		
}

