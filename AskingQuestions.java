import java.util.Scanner;

public class AskingQuestions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age, height_feet, height_inches;
		double weight;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How many feet tall are you? " );
		height_feet = keyboard.nextInt();
		System.out.print( "How many inches tall are you? " );
		height_inches = keyboard.nextInt();
		System.out.print( "How much do you weigh? " );
		weight = keyboard.nextDouble();

		System.out.println( "So you're " + age + " years old, " + height_feet + " feet " + height_inches + " inches " + " tall and " + weight + " heavy." );
	}
}