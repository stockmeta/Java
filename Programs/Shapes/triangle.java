import java.util.Scanner;
	public class triangle {
	public static void main (String[]args) {
	
	float base,height,area;
	
	Scanner in = new Scanner (System.in);
	
	System.out.println("Enter a base of a triangle: ");
	base = in.nextFloat();
	System.out.println("Enter a height of a triangle: ");
	height = in.nextFloat();
	area = base * height / 2;
	System.out.println("Area of a triangle: " + area);

}
}
