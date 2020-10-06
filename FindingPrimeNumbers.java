public class FindingPrimeNumbers
{
	public static void main( String[] args )
	{
		for( int n=1; n<=20; n++)
			if((isPrime(n)== true) )
				System.out.println(n + "< ");
			
			else
				System.out.println(n);
	
}

	public static boolean isPrime( int n )
{
		for(int x=2; x<n;x++) 
			if(n%x==0){
				return false;}

				
				return true;
	
}

}


