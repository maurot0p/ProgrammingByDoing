import java.util.Scanner;

public class Calculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		Double a, b, c;
		String op;

		do
		{
			System.out.print("> ");
			a  = keyboard.nextDouble();
			op = keyboard.next();
			b  = keyboard.nextDouble();

			if ( op.equalsIgnoreCase("+") )
				System.out.println(Suma(a,b));
			else if(op.equalsIgnoreCase("-"))
				System.out.println(Resta(a,b));
			else if(op.equalsIgnoreCase("*"))
				System.out.println(Multiplicacion(a,b));
			else if(op.equalsIgnoreCase("/"))
				System.out.println(Division(a,b));
			else if(op.equalsIgnoreCase("^"))
				System.out.println(Exponente(a,b));
			else
			{
				System.out.println("Undefined operator: '" + op + "'.");
				c = 0.0;
			}

		} while ( a>0 );
	}
	public static Double Suma( Double x, Double y){
		Double suma;
	 	suma=x+y;
	 	return suma;
	 }

	public static Double Resta( Double x, Double y){
	Double resta;
	 	resta=x-y;
	 	return resta;
	 }
	public static Double Multiplicacion( Double x, Double y){
		Double multi;
	 	multi=x*y;
	 	return multi;
	}
	public static Double Division( Double x, Double y){
		Double divi;
	 	divi=x/y;
	 	return divi;
	}
	public static Double Exponente( Double x, Double y){
		Double exp=x;
		for(int z=2; z<=y; z++){
				
				if(y==0){
					exp=1.0;	
				}
				else if(y==1){
					exp=x;
				}	
				else{
					exp=exp*x;}
		}		
		return exp;
	}

}