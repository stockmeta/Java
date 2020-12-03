import java.util.Scanner;
	public class addition {
	public static void main (String[]args) {
	Scanner in = new Scanner (System.in);
	
	int a,b,c;

	System.out.println("bAdd-ass!");
	System.out.println(" ");
	System.out.println("Enter first number:");
	a = in.nextInt();
	System.out.println("Enter second number:");
	b = in.nextInt();
	c = a+b;

	System.out.println("The sum is: " +c);
}
}
