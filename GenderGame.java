import java.util.Scanner;

public class GenderGame
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String gender, first_name, last_name, married;
		int age;
		System.out.print( "What is your gender? (M or F):" );
		gender = keyboard.next();
		System.out.print( "First name: " );
		first_name = keyboard.next();
		System.out.print( "Last name: " );
		last_name = keyboard.next();
		System.out.print( "Age: " );
		age = keyboard.nextInt();

		System.out.println();
		if( gender.equalsIgnoreCase("f") && ( age>=20))
		{
			System.out.println("Are you married " +first_name+ "? (y or n)");
			married = keyboard.next();
			if ( married.equalsIgnoreCase("y"))
				System.out.println("Then i shall call you Mrs." + last_name+ "." );
			
			else
				System.out.println("Then i shall call you Ms." + last_name+ ".");
		}
		else if( gender.equalsIgnoreCase("m") && ( age>=20))
		{
			System.out.println("Then i shall call you Mr." +last_name+ ".");
		}
		else
		{
			System.out.println("Then i shall call you " +first_name+ " " +last_name+ ".");
		}
	}
}