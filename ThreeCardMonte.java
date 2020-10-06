import java.util.Random;
import java.util.Scanner;
public class ThreeCardMonte
{
	public static void main( String[] args )
	{
Scanner keyboard = new Scanner(System.in);
Random r = new Random();
int ace = (1+ r.nextInt(3));
int guess;
System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
System.out.println("He lays down three cards.");
System.out.println();
System.out.println("Which one is the ace?");
System.out.println();
System.out.println("		##  			## 		##");
System.out.println("		1  				2 		3");
System.out.println();
guess= keyboard.nextInt();
if (guess==ace)
System.out.println("Fast Eddie is gonna kill himself tonight");
else if(guess!=ace)
System.out.println("FAST EDDIES GOT YOUR NUMBER. IT WAS ACTUALLY IN CARD #"+ace);
	}
}