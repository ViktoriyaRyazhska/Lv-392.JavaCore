import java.io.*;
public class HttpEnum {
	public enum HTTPError {
		BadRequest, Unauthorized, PaymentRequired;
	}
	public static void main(String[]args) throws IOException {
		HTTPError error = HTTPError.PaymentRequired;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of the error :");
		int input = Integer.parseInt(br.readLine());		
        switch(input) {
		case 400:
			 error = HTTPError.BadRequest;
			 break;
		case 401:	 
			 error = HTTPError.Unauthorized;
			 break;
		case 402:
			 error = HTTPError.PaymentRequired;
			break;	
		default:
			System.out.println("Unknown error");
		}
		if (input>=400 && input<=402) {
			System.out.println(error+" Error");	
		}	
	}
}
	