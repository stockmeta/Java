import java.util.Scanner;
	public class greatestoftwonumbers {
	public static void main (String[]args) {
	
	int num1,num2;
	
	Scanner in = new Scanner (System.in);
	
	System.out.println("Enter first number: " );
	num1 = in.nextInt();
	System.out.println("Enter second number: " );
	num2 = in.nextInt();
	
	if(num1>num2) {
		System.out.println("Greatest one: " + num1);
		}
	else {
		System.out.println("Greatest one: " + num2);
	}

}
}
