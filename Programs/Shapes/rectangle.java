import java.util.Scanner;
public class rectangle {
	public static void main (String[]args) {
	int length,width,area,perimeter;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter length of a rectangle:" );
	length = in.nextInt();
	System.out.println("Enter width of a rectangle:" );
	width = in.nextInt();
	area = length * width;
	perimeter = 2 * (length + width);
	System.out.println("Area of Rectangle: " + area);
	System.out.println("Perimeter of Rectangle: " + perimeter);	
}
}
