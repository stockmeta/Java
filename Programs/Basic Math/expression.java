import java.util.Scanner;
	public class expression {
	public static void main (String[]args) {
	Scanner in = new Scanner (System.in);
	
	int num1;
	int num;
	int num2;
	int num11;
	int num22;
	int num33;
	
	/* This is Mixed Expression */
	System.out.println("9 + 6 / 3 * 10 - 6 + 11 = " + (9 + 6 / 3 * 10 - 6 + 11));
	System.out.println("23 / 3 * 10 + (75) / 25 - 17 = " + (23 / 3 * 10 + 75 / 25 - 17));
	/* This is Type Conversion (Casting) */
	System.out.println("(double) 23 / 3 * (int) 10 + (double)(75) / 25 - (int)17 = " + ((double)(23) / 3 * (int) 10 + (double)(75) / 25 - (int)17));
	System.out.println("(int)(7.9) = " + (int)(7.9));
	System.out.println("(double)(25) = " + (double)(25));
	/* This is class String */
	System.out.println("Sunny " + "Day");
	System.out.println("Amount = $" + 567.25);
	System.out.println("The sum is = " + 12 + 26);
	System.out.println("The sum is 12" + 26);
	System.out.println("The sum is = " + (12 + 26));
	System.out.println("The sum is = " + 26);
	System.out.println(12 + 26 + " is the sum");
	System.out.println("The sum of "+ 12 +" and "+ 26 +" = " + (12 + 26));
	num1 = 5 * 5 - 10;
	System.out.println("The answer is = " + num1);
	num = 6;
	num = num + 2;
	System.out.println("The sum is = " + num);
	num11 = 18;
	num11 = num11 + 27;
	num22 = num11;
	num33 = num22 / 5;
	num33 = num33 / 4;
	System.out.println("The sum is: " + num11);
	System.out.println("The sum is: " + num22);
	System.out.println("The sum is: " + num33);
	
}
}
