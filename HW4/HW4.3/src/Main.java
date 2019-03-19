import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	 public static HTTPError choice(int num) {
	    	
         switch(num) {
         case 400:
            System.out.println("400 " + HTTPError.BadRequest + " error");
         return HTTPError.BadRequest;
            
        
         case 401:
            System.out.println("401 " + HTTPError.Unauthorized + " error");
            return HTTPError.Unauthorized;
    
    
         case 402:
            System.out.println("402 " + HTTPError.PaymentRequired+" error");
        return HTTPError.PaymentRequired;
         
         case 403:
         System.out.println("403"+ HTTPError.Forbidden+" error");
         return HTTPError.Forbidden;
     
        
         }
		return null;
    }

	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
HTTPError str;
	       
	        int num=Integer.parseInt(in.readLine());

	        str=Main.choice(num);
	    }


	}


