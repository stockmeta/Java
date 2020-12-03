import java.util.Scanner;
	public class rhombus2 {
	public static void main (String[]args) {
	
	double p,q,area;
	
	Scanner in = new Scanner (System.in);
	
	System.out.println("Enter area of a rhombus:" );
	area = in.nextDouble();
	System.out.println("Enter q diagonal:" );
	q = in.nextDouble();
	p = area * 2 / q;
	System.out.println("the p is:" + p);
	
}
}
