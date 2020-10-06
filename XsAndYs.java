import java.util.Scanner;

public class XsAndYs
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        for (  Double x = -10.0; x <= 10.0 ; x = x+0.5 )
        {
            System.out.println( x + "");
            Double y= (x*x);    	
            System.out.print( y + "\t");
        }

    }
}