public class ArmstrongNumbers
{
	public static void main( String[] args ) throws Exception
	{
			
		
			for ( int hund=0; hund<10; hund++ )
			
				for ( int tens=0; tens<10; tens++ )
				
					for ( int ones=0; ones<10; ones++ )
					{
						if(((Math.pow(hund,3)+Math.pow(tens,3)+ Math.pow(ones,3))==((hund*100)+(tens*10)+(ones))) && (((hund*100)+(tens*10)+(ones))>100) )
							System.out.println(hund + "" + tens + "" + ones);
					}
				
			
	}
}