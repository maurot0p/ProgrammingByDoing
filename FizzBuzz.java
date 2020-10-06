import java.util.Scanner;

public class FizzBuzz
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
    for ( int x=1; x<= 100; x= x+1 )
    {
        if ( x%3==0 )
        {
        System.out.println( "Fizz");
        }
        else if ( x%5==0 )
        {
        System.out.println( "Buzz");
        }
        else if ( x%3==0 && x%5==0)
        {
        System.out.println(  "FizzBuzz");
        }

        else 
        {
        System.out.println( x );
        }
    }

    }
}