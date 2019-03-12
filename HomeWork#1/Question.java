import java.util.Scanner;
class Question {
	  public static void main(String [] args) {
		  Scanner input = new Scanner(System.in); 
		  String name, address;
		  System.out.print("What is your name?");
		  name = input.nextLine();
		  System.out.print("Where are you live, "+name+" ? ");
		  address = input.nextLine();
		  String text;
		  text = "Your name is "+name+ " , You're from "+address+" ! ";
		  System.out.println(text);
	  }
}
