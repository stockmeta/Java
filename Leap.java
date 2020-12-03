import java.util.Scanner;
	public class Leap {
	public static void main (String[]args) {
	Scanner in = new Scanner (System.in);
	
	int year;
	
	System.out.println("Leap year or not?! Tell me!!!");
	System.out.println(" ");
	System.out.println("Enter a year: ");
	year = in.nextInt();
	
	if(year%4==0) {
		System.out.println("This is a leap year!");
	}
	else {
		System.out.println("This is not a leap year!");
	}
	
}
}
