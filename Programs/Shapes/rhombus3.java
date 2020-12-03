import java.util.Scanner;
	public class rhombus3 {
	public static void main (String[]args) {
	
	double p,q,area;
	
	Scanner in = new Scanner (System.in);
	
	System.out.println("Enter area of a rhombus:" );
	area = in.nextDouble();
	System.out.println("Enter p diagonal:" );
	p = in.nextDouble();
	q = area * (2 / p);
	System.out.println("the q is:" + q);
	
}
}
