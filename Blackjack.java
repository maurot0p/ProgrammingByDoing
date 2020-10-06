import java.util.Scanner;
import java.util.Random;
public class Blackjack
{
	public static void main( String[] args )
	{
Scanner keyboard = new Scanner(System.in);
Random r = new Random();
String answer, answer_wager;
int wager;
System.out.println("Welcome to Mauricio's blackjack!");
System.out.println("Would you like to wager? Y/N");
answer_wager=keyboard.next();
if(answer_wager.equalsIgnoreCase("y")){
System.out.println("How much would you like to wager(USD)");
wager= keyboard.nextInt();
System.out.println("Ok so " +wager+ "USD it is!");
}
else if (answer_wager.equalsIgnoreCase("n"))
System.out.println("You do seem like a bit of a pussy");
int secret_number1 = (2+ r.nextInt(11));
int secret_number2 = (2+ r.nextInt(11));
int sum= secret_number1+secret_number2;
System.out.println("You drew " +secret_number1+ " and " +secret_number2);
System.out.println("Your total is " +sum);
if(sum>=21){
System.out.println("The dealer wins!");
 System.exit(1);}
int secret_number3 = (2+ r.nextInt(10));
int secret_number4 = (2+ r.nextInt(10));
int sumdealer= secret_number3+secret_number4;
System.out.println("The dealer has " +secret_number3+ " and another card hidden");
System.out.println("His total  is hidden too");
System.out.println();
do{
	System.out.print("Would you like to \"hit\" or \"stay\" ");
	answer= keyboard.next();
	if(answer.equalsIgnoreCase("hit") ){
	int secret_number = (2+ r.nextInt(11));
	sum= sum+secret_number; 
	System.out.println("Your total is now " +sum );
		if(sum>=21)
			System.out.println("The dealer wins and gets all your money!!!!!");}
	}
while (answer.equalsIgnoreCase("hit") && sum<21);

if(answer.equalsIgnoreCase("stay"))
	{
	System.out.println("It is now the dealer's turn" );
	System.out.println("His hidden card was " +secret_number4 );
	System.out.println("His total was " +sumdealer );
	while(sumdealer<=16)
	{
		System.out.println("Dealer chooses to hit ");
		int secret_number5 = (2+ r.nextInt(10));
		sumdealer= sumdealer+secret_number5;
		System.out.println("His total is now " +sumdealer);
	}
	if(sumdealer>16)
		System.out.println("Dealer chooses to stay ");
	}	

	
if(((sum)> (sumdealer) && (sum<21))  || sumdealer>=21)
		System.out.println("You win!");
else if( sumdealer>=sum)
		System.out.println("Dealer wins!" );

	}
}