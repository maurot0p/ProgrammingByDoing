import java.util.Random;
import java.util.Scanner;
public class OneShotHiLo
{
	public static void main( String[] args )
	{
Scanner keyboard = new Scanner(System.in);
Random r = new Random();
int number = (1+ r.nextInt(100));
int guess;
System.out.println("Im thinking of a number from 1-100. Try to guess it");
guess= keyboard.nextInt();
if (guess==number)
System.out.println("WTF YOU ACTUALLY GUESSED IT");
else if(guess>number)
System.out.println("Your guess is a bit too high. I was actually thinking of "+number);
else if(guess<number)
System.out.println("Your guess is a bit too low mate. I was actually thinking of "+number);
	}
}