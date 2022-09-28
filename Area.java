
import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	    
	    double   area;
	    int radius;
	    
	    Scanner input = new Scanner(System.in);
	    
		System.out.println("enter the radius of the circle");
		radius = input.nextInt();
		
		input.close();
		
		area = Math.PI* radius* radius;
		
		System.out.println("Area of the Cricle is " +area);
	}
}
