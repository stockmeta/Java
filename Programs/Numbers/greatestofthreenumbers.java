import java.util.Scanner;
	public class greatestofthreenumbers {
	public static void main (String[]args) {
	
	int num1,num2,num3;
	
	Scanner in = new Scanner (System.in);
	
	System.out.println("Enter first number: ");
	num1 = in.nextInt();
	System.out.println("Enter second number: ");
	num2 = in.nextInt();
	System.out.println("Enter third number:" );
	num3 = in.nextInt();
	
	
	if(num1>num2) {
		if(num1>num3) {
		System.out.println("Greatest one: " + num1);
		}
	else {
		System.out.println("Greatest one: " + num3);
		}
	}
	else
	if(num2>num3) {
		System.out.println("Greatest one: " + num2);
		}
	else {
		System.out.println("Greatest one: " + num3);
		}
		
}
}
