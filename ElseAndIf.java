public class ElseAndIf
{
	public static void main( String[] args )
	{
		int people = 24 ;
		int cars = 25;
		int buses = 15;

		if ( cars > people )
		{
			System.out.println( "We should take the cars." );  
		}
		else if ( cars < people )    //te dice ok si es esto ha eto, pero te dice si NO Es es esto puede ser esto otro
		{
			System.out.println( "We should not take the cars." );
		}
		else     //luego ta else, dice, SI NO E NINGUNO DE LO OTRO HA ETO.
		{
			System.out.println( "We can't decide." );
		}


		if ( buses > cars )
		{
			System.out.println( "That's too many buses." );
		}
		else if ( buses < cars )
		{
			System.out.println( "Maybe we could take the buses." );
		}
		else
		{
			System.out.println( "We still can't decide." );
		}


		if ( people > buses )
		{
			System.out.println( "All right, let's just take the buses." );
		}
		else
		{
			System.out.println( "Fine, let's stay home then." );
		}

	}
}