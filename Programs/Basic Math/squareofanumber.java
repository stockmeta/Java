import java.util.Scanner;
	public class squareofanumber {
	public static void main (String[]args) {
	
	double z;
	
	Scanner in = new Scanner (System.in);
	
	System.out.println("Enter a number:" );
	z = in.nextInt();	
	z = Math.pow(z,2);
	System.out.println("The square of a number:" + z);
	
}
}
	
