import java.util.Scanner;

public class CountingMachineRevisited
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Count from: " );
        int n = keyboard.nextInt();
        System.out.print( "Count to: " );
        int n2 = keyboard.nextInt();
        System.out.print( "Count by: " );
        int n3 = keyboard.nextInt();


        for (  int i = n; i <= n2 ; i = i+n3 )
        {
            System.out.print( i + " " );
        }

    }
}