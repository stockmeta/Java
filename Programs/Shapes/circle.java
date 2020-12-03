import java.util.Scanner;
public class circle {
	public static void main (String[]args) {
			
	int radius,area,circumference;
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter first Radius of a Circle: ");
	radius = in.nextInt();
	System.out.println("Enter first Radius of a Circle: ");
	radius = in.nextInt();
	circumference = 2 * radius * 22 / 7;
	area =  radius * radius * 22 / 7;
	
	System.out.println("Area of the Circle: " + area);
	System.out.println("Circumference of the Circle: " + circumference);

}
}
	
	
