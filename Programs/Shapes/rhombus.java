import java.util.Scanner;
	public class rhombus {
	public static void main (String[]args) {
	
	float diagonal1,diagonal2,area;
	
	Scanner in = new Scanner (System.in);
	
	System.out.println("Enter the length of the first diagonal:" );
	diagonal1 = in.nextFloat();
	System.out.println("Enter the length of the second diagonal:" );
	diagonal2 = in.nextFloat();
	area = diagonal1 * diagonal2 / 2;
	System.out.println("Area of a Rhombus: " + area);
	
}
}
