import java.util.Scanner;

public class CountingWhile
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it five times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();
		System.out.print( "How many times shall i repeat it?" );
		int times = keyboard.nextInt();
		int n = 0;
		while ( n < times )
		{
			System.out.println( (10*(n+1)) + ". " + message );
			n++;  // ++ le anade 1 a la variable
		}
	}
}