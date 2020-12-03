import java.util.Scanner;
	public class calculator {
	public static void main (String[]args) {
	Scanner in = new Scanner (System.in);
	
	int code;
	int a,b,c;
	int d,e,f;
	int g,h,i;
	double j,k,l;
	
	System.out.println("Calculator");
	System.out.print("");
	
	System.out.println("Choose '1' if you want to add");
	System.out.println("Choose '2' if you want to subtract");
	System.out.println("Choose '3' if you want to multiply");
	System.out.println("Choose '4' if you want to divide");
	
	System.out.println(" ");
	code = in.nextInt();
	
	switch(code) {
	
	case 1: System.out.println("Addition");
		System.out.println("Enter a number: ");
		a = in.nextInt();
		System.out.println("Enter a number: ");
		b = in.nextInt();
		c = a + b;
		System.out.println("The sum is: " + c);
	break;
	
	case 2: System.out.println("Subtraction");
		System.out.println("Enter a number: ");
		d = in.nextInt();
		System.out.println("Enter a number: ");
		e = in.nextInt();
		f = d - e;
		System.out.println("The difference is: " + f);
	break;
	
	case 3: System.out.println("Multiplication");
		System.out.println("Enter a number: ");
		g = in.nextInt();
		System.out.println("Enter a number: ");
		h = in.nextInt();
		i = g * h;
		System.out.println("The product is: " + i);
	break;
	
	case 4: System.out.println("Division");
		System.out.println("Enter a number: ");
		j = in.nextDouble();
		System.out.println("Enter a number: ");
		k = in.nextDouble();
		l = j / k;
		System.out.println("The quotient is: " + l);
	break;
	
	default: System.out.println("OUT OF RANGE!!");
	
}
}
}
