import java.util.Scanner;

public class BMICategories
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		double altura_m, peso_kg, imc ;
		System.out.print( "Tu altura en metros: " );
		altura_m = keyboard.nextDouble();
		System.out.print( "Tu peso en Kg; " );
		peso_kg = keyboard.nextDouble();
		imc= (peso_kg/(altura_m*altura_m));
		System.out.printf ("IMC:"+"%.2f", imc );
		System.out.println();
		if( imc < 18.5)
		{
			System.out.println("Categoria IMC: Bajo peso");
		}
		if( (imc >= 18.5) && (imc<=24.9) )
		{
			System.out.println("Categoria IMC: Peso normal");
		}
		if( (imc >= 25.0) && (imc<=29.9))
		{
			System.out.println("Categoria IMC: Sobre peso");
		}
		if( imc >=30.0)
		{
			System.out.println("Categoria IMC: Obeso");
		}
  	}
}