

public class EvennessFunction
{
	public static void main( String[] args )
	{
		for( int n=1; n<=20; n++)
			if((isEven(n)== true) && (isDivisibleBy3(n)==true) ){
				System.out.println(n + "<= ");}

			else if((isEven(n)== true) && (isDivisibleBy3(n)==false)){
				System.out.println(n + "< ");
			}
			else if((isDivisibleBy3(n)==true) && (isEven(n)== false) ){
				System.out.println(n + "= ");
			}
			else
				System.out.println(n);
	
}

	public static boolean isEven( int n )
{
	if(n%2==0){
		return true;
	}
	else{
		return false;
	}
}
	public static boolean isDivisibleBy3( int n )
{
	if(n%3==0){
		return true;
	}
	else{
		return false;
	}
}
}

