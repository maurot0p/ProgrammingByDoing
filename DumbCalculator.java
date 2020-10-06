import java.util.Scanner;

public class BMICalc
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		double altura_m, peso_kg;
		System.out.print( "Tu altura en metros: " );
		altura_m = keyboard.nextDouble();
		System.out.print( " Tu peso en Kg " );
		peso_kg = keyboard.nextDouble();
		System.out.print( " BMI: " +(peso_kg/(altura_m*altura_m)) );
  	}
}