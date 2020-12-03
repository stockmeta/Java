import java.util.Scanner;
public class parallelogram {
	public static void main (String[]args) {
	
	int base,perpendicular,area;
	
	Scanner in = new Scanner (System.in);
	
	System.out.println("Enter a base:" );
	base = in.nextInt();
	System.out.println("Enter a perpendicular:" );
	perpendicular = in.nextInt();
	area = base * perpendicular;
	System.out.println("Area of a Parallelogram: " + area);

}
}
