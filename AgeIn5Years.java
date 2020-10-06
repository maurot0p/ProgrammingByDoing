import java.util.Scanner;

public class AgeIn5Years
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		double number_1, number_2, number_3 ;
		System.out.print( " Gimme a number " );
		number_1 = keyboard.nextDouble();
		System.out.print( " A second number " );
		number_2 = keyboard.nextDouble();
		System.out.print( " Now a third number " );
		number_3 = keyboard.Double();
		System.out.println( (number_1 + number_2 + number_3)/2) 
	}
}