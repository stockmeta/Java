import java.util.Scanner;
public class multiplication{
public static void main (String[]args){
	Scanner in = new Scanner (System.in);
	int a,b,c;
	System.out.println("Enter two digits to multiply:");
	a=in.nextInt();
	b=in.nextInt();
	c=a*b;
	System.out.println("product is"+c);
}
}
