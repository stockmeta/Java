import java.util.Scanner;
	public class ternary {
	public static void main (String[]args) {
	
	Scanner in = new Scanner (System.in);
	
	int num1,num2,gone;
	
	System.out.println("Enter first number: ");
	num1 = in.nextInt();
	System.out.println("Enter second number:" );
	num2 = in.nextInt();
	gone=(num1>num2)?num1:num2;
	System.out.println("Greatest one: " + gone);
	
}
}
