import java.util.Scanner;

public class MainHTTPError {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter the HTTPError number, please...");
		int error = sc.nextInt();
					
		HTTPError er;
		
		switch (error) {
		case 400:  
			er = HTTPError.BADREQUEST; 
			System.out.println("The error is: " + er); 
			break;
		case 401: 
			er =  HTTPError.UNAUTORIZED;
			System.out.println("The error is: " + er);
			break;
		case 402:
			er = HTTPError.PAYMENTREQUIRED; 
			System.out.println("The error is: " + er);
			break;
			default:
			System.out.println("Unknown error");
		}
		
	}

}
