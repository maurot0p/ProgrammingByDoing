import java.util.Scanner;
public class TwentyQuestions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String answer_1, answer_2;
		System.out.println("Two questions!");
		System.out.println("Think of an object and i'll try to guess it");
		System.out.println("Q1) Is it animal, vegetable or mineral? " );
		answer_1 = keyboard.next();
		System.out.println("Q2) Is it bigger than a breadbox? " );
		answer_2 = keyboard.next();
		if ( answer_1.equalsIgnoreCase("vegetable") )
		{
			if( answer_2.equalsIgnoreCase("no"))
				System.out.println("You are thinking of a carrot " );
			else if( answer_2.equalsIgnoreCase("yes"))
				System.out.println("You are thinking of a watermelon" );
		}
		else if ( answer_1.equalsIgnoreCase("animal"))
		{
			if( answer_2.equalsIgnoreCase("no"))
				System.out.println(" You are thinking of a squirrel" );
			else if( answer_2.equalsIgnoreCase("yes"))
				System.out.println("You are thinking of a moose" );
		}
		else if ( answer_1.equalsIgnoreCase("mineral"))
		{
			if ( answer_2.equalsIgnoreCase("no"))
				System.out.println("You are thinking of a paper clip" );
			else if( answer_2.equalsIgnoreCase("yes"))
				System.out.println("You are thinking of a Camaro" );
		}
		else
		{
			System.out.println("You dont know how to type");
		}
		System.out.println();
		System.out.println("Well, to be honest i dont care what you are thinking");
	}
}