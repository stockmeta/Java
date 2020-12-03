import java.util.Scanner;
	public class allin {
	public static void main (String[]args) {
	Scanner in = new Scanner (System.in);
	
	int a,b,c,d,e,f,g,h,i;
	double j,k,l;
	
	System.out.println("Addition");
	System.out.println(" ");
	System.out.println("Enter a number: ");
	a = in.nextInt();
	System.out.println("Enter a number: ");
	b = in.nextInt();
	c = a + b;
	System.out.println("The sum is: " + c);
	System.out.println(" ");
	
	System.out.println("Subtraction");
	System.out.println(" ");
	System.out.println("Enter a number: ");
	d = in.nextInt();
	System.out.println("Enter a number: ");
	e = in.nextInt();
	f = d - e;
	System.out.println("The sum is: " + f);
	System.out.println(" ");
	
	System.out.println("Multiplication");
	System.out.println(" ");
	System.out.println("Enter a number: ");
	g = in.nextInt();
	System.out.println("Enter a number: ");
	h = in.nextInt();
	i = g * h;
	System.out.println("The sum is: " + i);
	System.out.println(" ");
	
	System.out.println("Division");
	System.out.println(" ");
	System.out.println("Enter a number: ");
	j = in.nextDouble();
	System.out.println("Enter a number: ");
	k = in.nextDouble();
	l = j / k;
	System.out.println("The sum is: " + l);
	System.out.println(" ");
	
}
}
