import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First {
	static StringBuilder sb;
	
	
	
	public static void main(String[]args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Write sentence of 5 words!!!");
		String str = br.readLine();
		String[]text = str.split(" ");
		//String longestWord = text[0];
		String max = "";
		for(int i = 0; i<text.length; i++) {
			if(text[i].length() > max.length()) {
				max = text[i];
			}
			if(i==1) {
				sb = new StringBuilder(text[i]);
				System.out.println(sb.reverse());
			}		
		}
		System.out.println(max);
		System.out.println("Word Has "+max.length()+" letters");
		
			
			
		
		
		}

}
