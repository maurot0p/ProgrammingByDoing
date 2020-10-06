import java.util.Scanner;
import java.util.Random;
public class KeepGuessing
{
	public static void main( String[] args )
	{
Scanner keyboard = new Scanner(System.in);
Random r = new Random();
int secret_number = (1+ r.nextInt(10));
int guess;
System.out.println("LETS PLAY A GAME!!!! GUESS A NUMBER FROM 1-10");
guess = keyboard.nextInt();

while ( guess!= secret_number)
{
	System.out.print("Wrong! \t Pick another number:");
	guess = keyboard.nextInt();
}
	System.out.println("Congratulations, you finally guessed the right number");
	}
}