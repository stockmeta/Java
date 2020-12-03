import java.util.Scanner;
public class threenumbers {
	public static void main (String[]args) {
			
	int w,x,y,z;
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter first number:" );
	x=in.nextInt();
	System.out.println("Enter second number:" );
	y = in.nextInt();
	System.out.println("Enter third number:" );
	w = in.nextInt();
	z= w + x + y;
	System.out.println("Sum of two numbers: " + z);

}
}
