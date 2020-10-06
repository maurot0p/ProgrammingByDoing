import java.util.Scanner;

public class CountingByHalves
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        for (  Double i = -10.0; i <= 10.0 ; i = i+0.5 )
        {
            System.out.print( i + " ");
        }

    }
}