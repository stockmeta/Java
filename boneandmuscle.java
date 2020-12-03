import java.util.Scanner;
	public class boneandmuscle {
	public static void main (String[]args) {
	Scanner in = new Scanner (System.in);
	
	int code;
	
	System.out.println("Three little facts about bone and muscle");
	System.out.println("");
	System.out.println("Choose '1' if you want to know about 'Tendon'");
	System.out.println("Choose '2' if you want to know about 'Ligament'");
	System.out.println("Choose '3' if you want to know about 'Fascia'");
	System.out.println("");
	
	System.out.println("Enter the bone and muscle code: ");
	code = in.nextInt();
	switch(code) {
		
		case 1: System.out.println("Tendon: Connects from bone to bone");
			break;
		
		case 2: System.out.println("Ligament: Connects from bone to muscle");
			break;
		
		case 3: System.out.println("Fascia: Connects from muscle to muscle");
			break;
		
		default: System.out.println("OUT OF RANGE!!!");
		
}
}
}
	
	
