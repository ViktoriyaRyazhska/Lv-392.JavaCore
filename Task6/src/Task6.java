import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
	    System.out.println("Put text: ");
	    
	    String text = br.readLine();
	    int count = 0;
	    
       
        if(text.length() != 0){
            count++;
           
            for (int i = 0; i < text.length(); i++) {
                if(text.charAt(i) == ' '){
                    
                    count++;
                }
            }
        }

        System.out.println("You put "+count+" words"); 

}
}
