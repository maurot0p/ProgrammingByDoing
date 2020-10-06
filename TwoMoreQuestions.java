import java.util.Scanner;
public class TwoMoreQuestions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String answer_1, answer_2;
		System.out.println("Two MORE questions!");
		System.out.println("Think of an WHATEVER and i'll try to guess it");
		System.out.println("Q1) Does it belong inside, outside or both? " );
		answer_1 = keyboard.next();
		System.out.println("Q2) Is it alive " );
		answer_2 = keyboard.next();
		if ( answer_1.equalsIgnoreCase("inside") && (answer_2.equalsIgnoreCase("yes")) )
		{
			System.out.println("You are thinking of a house plant");
		}
		if ( answer_1.equalsIgnoreCase("inside") && (answer_2.equalsIgnoreCase("no")) )
		{
			
				System.out.println(" You are probably thinking of a shower curtain " );
		}
		if ( answer_1.equalsIgnoreCase("outside") && (answer_2.equalsIgnoreCase("yes")) )
		{
				System.out.println("You are thinking of a bison" );
		}
		if ( answer_1.equalsIgnoreCase("outside") && (answer_2.equalsIgnoreCase("no")) )
		{
			System.out.println("You are thinking of a billboard");
		}
		if ( answer_1.equalsIgnoreCase("both") && (answer_2.equalsIgnoreCase("yes")) )
		{
			System.out.println(" You are thinking of a freaking dog, awg how boring");
		}
		if ( answer_1.equalsIgnoreCase("both") && (answer_2.equalsIgnoreCase("no")) )
		{
				System.out.println(" You are thinking of a cell phone, awg how boring");
		}
		System.out.println();
		System.out.println("Well, to be honest i dont care what you are thinking");
	}
}