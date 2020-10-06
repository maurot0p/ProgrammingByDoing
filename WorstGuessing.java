import java.util.Scanner;
public class WorstGuessing
{
	public static void main( String[] args )
	{
Scanner keyboard = new Scanner(System.in);
int secret_number = 3;
int guess;
System.out.println("LETS PLAY A GAME!!!! GUESS A NUMBER FROM 1-10");
guess = keyboard.nextInt();

if ( guess== secret_number)
	System.out.println("HOLY SHIT YOU WON YOU ARE A FUCKING GENIUS, CANT BELIEVE YOU GUESSED IT WAS " +guess+ "!!");
else
	System.out.println("YEA YOU SUCK!! IT WAS " +secret_number+  "!!");
	}
}