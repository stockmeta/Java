import util.java.Scanner;
	public class oddoreven {
	public static void main (String[]args) {
	Scanner in = new Scanner (System.in);
	
	int num;
	
	System.out.println("Are you odd or you can't even?!");
	System.out.println(" ");
	System.out.println("Enter a number: ");
	num = in.nextInt();

	if(num%2==0) {
		System.out.println("Even!");
	}
	else {
		System.out.println("Odd!");
	}

}
}
