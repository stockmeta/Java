import java.util.Scanner;
	public class decimal {
	public static void main (String[]args) {
	Scanner in = new Scanner (System.in);
	
	float a,b,c;
	
	System.out.println("Addition with a twist; with decimals!");
	System.out.println(" ");
	System.out.println("Enter first number: ");
	a = in.nextFloat();
	System.out.println("Enter second number: ");
	b = in.nextFloat();
	c = a + b;
	System.out.println("The sum is: " + c);
	
}
}
