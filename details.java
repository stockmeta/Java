import java.io.*;

public class details
{
    public static void main( String[] args )
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        String name = in.readLine();
        System.out.println("Hello " + name);
    }
}
