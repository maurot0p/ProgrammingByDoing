
public class GettingIndividualDigits
{
	public static void main( String[] args ) throws Exception
	{
			
						for ( int c=10; c<100; c++ ) {
					
							int digit_2= c%10;
							int digit_1=(c/10)%10;

				System.out.println(c + ", " + digit_1 +  " + " + digit_2 + "=" + ( (digit_1)+(digit_2)) ) ;
			}
	}
}