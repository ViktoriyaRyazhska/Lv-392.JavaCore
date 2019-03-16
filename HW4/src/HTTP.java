import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HTTP {
	public static void main(String[]args) throws NumberFormatException, IOException {
		HTTPError httperror = HTTPError.BadRequest;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());		
		

		switch(a) {
		case 400:
			 httperror = HTTPError.BadRequest;
			 break;
		case 401:	 
			 httperror = HTTPError.Unauthorized;
			 break;
		case 402:
			httperror = HTTPError.PaymentRequired;
			break;
		case 403:
			httperror = HTTPError.Forbidden;
			break;
		case 404:
			httperror = HTTPError.NotFound;
			break;	
		default:
			System.out.println("We don't know nothing about this problem.");
		}
		if (a>399 && a<405) {
			System.out.println("This is error number "+a+" - "+ httperror+"!");	
		}
	}

	}
	
