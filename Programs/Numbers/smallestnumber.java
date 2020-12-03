import java.util.Scanner;
	public class smallestnumber {
	public static void main (String[]args) {
	Scanner in = new Scanner (System.in);
	
	int num1,num2,num3;
	
	System.out.print("Input number 1: ");
	num1 = in.nextInt();
	System.out.println("Input number 2: ");
	num2 = in.nextInt();
	System.out.println("Input number 3: ");
	num3 = in.nextInt();
	
	if(num1<num2 && num1<num3) {
		System.out.println("The Smallest One: " + num1);
		}
	else
	if(num2<num1 && num2<num3) {
		System.out.println("The Smallest One: " + num2);
		}
	else
	if(num3<num1 && num3<num2) {
		System.out.println("The Smallest One: " + num3);
		}
	else {
		System.out.println("None Applicable");
		}
		
}
}
