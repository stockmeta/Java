import java.util.Scanner;
	public class sample {
	public static void main (String[]args) {
	Scanner in = new Scanner (System.in);
	
	double v,t,wci;
	
	System.out.println("Enter v: ");
	v = in.nextDouble();
	System.out.println("Enter t: ");
	t = in.nextDouble();
	
	if(v>=0)&&(v<=4) {
		System.out.println("The product is: " + t);
	}
	else
	if(v>=45) {
		System.out.println("The product is: " + ((1.6 * t) -55));
	}
	else {
		System.out.println("The product is: " + (91.4 + 91.4 - t));
		System.out.println("The product is: " + (0.0203 - 0.0304 - 0.474));
	}
	
}
}
