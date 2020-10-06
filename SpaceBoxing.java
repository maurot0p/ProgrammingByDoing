import java.util.Scanner;
public class SpaceBoxing
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int weight_earth;
		int planet_visiting;
		System.out.println("Please enter your current earth weight");
		weight_earth = keyboard.nextInt();
		System.out.println("I have info on the following planets" );
		System.out.println( "1. Venus 	2. Mars 	3. Jupiter" );
		System.out.println( "4. Saturn 	5. Uranus 	6. Neptune" );
		System.out.println("Which planet are you visiting?");
		planet_visiting = keyboard.nextInt();
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