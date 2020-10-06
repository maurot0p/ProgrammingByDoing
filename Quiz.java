import java.util.Scanner;
public class LittleQuiz
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int weight_earth;
		int planet_visiting;
		System.out.println("Are you ready for a quiz?");
		keyboard.next();
		System.out.println("Q1) What is the capital of the United States" );
		System.out.println( "1) Paris" );
		System.out.println( "2) Washington");
		System.out.println( "3) NewYork");

		answer_1 = keyboard.nextInt();
		if ( planet_visiting == 1 )
		{
			System.out.println( "Your weight would be "+(weight_earth*0.78)+"lbs.");   
		}
		if ( planet_visiting == 2 )
		{
			System.out.println( "Your weight would be "+(weight_earth*0.39)+"lbs.");
		}
		if ( planet_visiting == 3 )
		{
			System.out.println( "Your weight would be "+(weight_earth*2.65)+"lbs.");
		}
		if ( planet_visiting == 4 )
		{
			System.out.println( "Your weight would be "+(weight_earth*1.17)+"lbs." );
		}	
		if ( planet_visiting == 5 )
		{
			System.out.println( "Your weight would be "+(weight_earth*1.05)+"lbs.");
		}
		if ( planet_visiting == 6 )
		{
			System.out.println( "Your weight would be "+(weight_earth*1.23)+"lbs.");
		}
	}
}