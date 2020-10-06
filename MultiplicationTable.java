
public class MultiplicationTable
{
	public static void main( String[] args ) throws Exception
	{
		for ( int x=1; x<=9; x++ ){
			System.out.println(" " +x );
			for ( int y=1; y<=12; y++ )		
					{
						System.out.print( " | " + (x*y) + "\t"  );
						
					}
				}
	}
}