import java.util.Scanner;

public class BabyCalculator
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
				c = a + b;
			else if(op.equalsIgnoreCase("-"))
				c= a - b;
			else if(op.equalsIgnoreCase("*"))
				c= a * b;
			else if(op.equalsIgnoreCase("/"))
				c= a / b;
			else
			{
				System.out.println("Undefined operator: '" + op + "'.");
				c = 0.0;
			}

			System.out.println(c);

		} while ( a>0 );
	}
}