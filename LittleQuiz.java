import java.util.Scanner;
public class LittleQuiz
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int answer_1, answer_2, answer_3;
		int correctCount = 0;
		System.out.println("Are you ready for a quiz?");
		keyboard.next();
		System.out.println("Q1) What is the capital of the United States" );
		System.out.println( "1) Paris" );
		System.out.println( "2) Washington");
		System.out.println( "3) NewYork");
		answer_1 = keyboard.nextInt();
		if ( answer_1 == 2 )
		{
			System.out.println( "Correct!");   
			correctCount++;
		}
		else
		{
			System.out.println( "You are so wrong.");
		}
		System.out.println("Q2) Can you kill a duck with a straw?" );
		System.out.println( "1) Yes" );
		System.out.println( "2) No");
		answer_2 = keyboard.nextInt();
		if ( answer_2 == 1 )
		{
			System.out.println( "Correct!"); 
			correctCount++;  
		}
		else
		{
			System.out.println( "Are you retarded?");
		}
		System.out.println("Q3) What weights more, a lb of sugar or a lb of rocks" );
		System.out.println( "1) They weight the same" );
		System.out.println( "2) Sugar");
		System.out.println( "3) Rocks");
		answer_3 = keyboard.nextInt();
		if ( answer_3 == 1)
		{
			System.out.println( "You are correct");  
			correctCount++; 
		}
		else
		{
			System.out.println( "You are mentally challenged");
		}
		System.out.println();
		System.out.println( "You got "+correctCount+" out of 3 correct.");
		System.out.println("Thanks for playing" );
	}
}