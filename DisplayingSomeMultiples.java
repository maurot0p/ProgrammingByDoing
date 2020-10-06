import java.util.Scanner;

public class DisplayingSomeMultiples
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Choose a number: ");
		int number = keyboard.nextInt();
		for(int x=1; x<=12; x++){
			System.out.println(number*x);
		}
	}
}