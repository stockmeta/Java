import java.util.Scanner;
	public class parallelogram2 {
	public static void main (String[]args) {
	Scanner in = new Scanner (System.in);
	
	int base,area,perpendicular;
	
	System.out.println("Finding the base of a Parallelogram!");
	System.out.println(" ");
	System.out.println("Enter area :");
	area = in.nextInt();
	System.out.println("Enter perpendicular: ");
	perpendicular = in.nextInt();
	base = area / perpendicular;
	System.out.println("The base is: " + base);
	
}
}
