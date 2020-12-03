import java.util.Scanner;
	public class triangle2 {
	public static void main (String[]args) {
	Scanner in = new Scanner (System.in);
	
	float base, height, area;
	
	System.out.println("Enter area of a triangle: ");
	area = in.nextFloat();
	System.out.println("Enter base of a triangle: ");
	base = in.nextFloat();
	height = 2 * (area / base);
	
	System.out.println("The height is: " + height);
	
}
}
