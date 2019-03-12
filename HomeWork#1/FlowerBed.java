import java.util.Scanner;
public class FlowerBed {
	public static void main(String [] args) {
	 Scanner io = new Scanner(System.in);
	 System.out.println("Input the radius of the Flower bed: ");
	 double radius = io.nextDouble();
	 System.out.println("Perimeter is = " + (2 * radius * Math.PI));
	 System.out.println("Area is = " + (Math.PI * radius * radius));
  }
}		