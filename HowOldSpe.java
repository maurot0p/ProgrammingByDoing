import java.util.Scanner;
public class HowOldSpe
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

		else if ( age <= 17 )
		{
			System.out.println( "You can drive but not vote, "+ name +" . "); //else if solo corre si el de arriba es falso, por eso este code solo imprime un mensaje
		}
		else if ( age <= 24 )
		{
			System.out.println( "You can vote but not rent a car, "+ name +" . " );
		}

		else
		{
			System.out.println( "You can do anything you want chief" );
		}	
	}
}