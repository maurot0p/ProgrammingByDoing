import java.util.Scanner;
public class HowOld
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int age;
		String name;
		System.out.println("Hey, Whats your name?");
		name = keyboard.next();
		System.out.println("Hey " + name + " , How old are you? " );
		age = keyboard.nextInt();
			if ( age < 16 )
		{
			System.out.println( "You cant drive" );   // el if statement lo que hace es condicionar, si esta variable es mayor que esta variable imrpime este codigo
		}

		if ( age < 18 )
		{
			System.out.println( "You cant vote, "+ name +" . ");
		}
		if ( age < 25 )
		{
			System.out.println( "You cant rent a car, "+ name +" . " );
		}

		if ( age >= 25 )
		{
			System.out.println( "You can do anything you want chief" );
		}	
	}
}