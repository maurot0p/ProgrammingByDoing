import java.util.Scanner;
public class AgeMessages3
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String answer_1;
		int answer_2;
		System.out.print("Your name:");
		answer_1 = keyboard.next();
		System.out.print("Your age");
		answer_2 =keyboard.nextInt();
		if( answer_2 <16 )
		{
		System.out.println("You cant drive " +answer_1+ ".");
		}
		if( answer_2>=16 && answer_2<18 )
		{
			System.out.println(" You can drive but not vote " +answer_1+ ".");
		}
		if( answer_2>=18 && answer_2<25)
		{
			System.out.println(" You can vote but not rent a car " +answer_1+ "." );
		}
		if ( answer_2>=25)
		{
			System.out.println(" You can do anything you want chief");
		}
	}
}