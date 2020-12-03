import java.util.Scanner;
public class square {
	public static void main (String[]args) {
			
	float area,side,perimeter;
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter the side of a square:" );
	side = in.nextFloat();
	System.out.println("Enter the side of a square:" );
	side = in.nextFloat();
	area = side * side;
	perimeter = side * side;
	
	System.out.println("Area of a square: " + area);
	System.out.println("Perimeter of a square: " + perimeter);
}
}
