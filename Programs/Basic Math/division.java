import java.util.Scanner;
public class division{
	public static void main (String[]args){
	Scanner in = new Scanner (System.in);
	int a,b,c;
	System.out.println("Enter two digits to divide:");
	a=in.nextInt();
	b=in.nextInt();
	c=a/b;
	System.out.println("quotient is:"+c);
}
}
