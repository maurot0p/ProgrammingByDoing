import java.util.Scanner;
import java.util.Random;
public class BabyBlackjack
{
	public static void main( String[] args )
	{
Scanner keyboard = new Scanner(System.in);
Random r = new Random();
System.out.println("Baby blackjack!");
int secret_number1 = (1+ r.nextInt(10));
int secret_number2 = (1+ r.nextInt(10));
System.out.println("You drew " +secret_number1+ " and " +secret_number2);
System.out.println("Your total is " +(secret_number1+secret_number2));
int secret_number3 = (1+ r.nextInt(10));
int secret_number4 = (1+ r.nextInt(10));
System.out.println("The dealer has " +secret_number3+ " and " +secret_number4);
System.out.println("His total  is " +(secret_number3+secret_number4));

	if((secret_number3+secret_number4)> (secret_number1+secret_number2))
		System.out.println("The dealer wins" );
	else
		System.out.println("You win" );
	}
}