import java.util.Scanner;

public class SchoolReport
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String first_name, second_name, login;
		int grade, student_id;
		double gpa;

		System.out.print( "First name: " );
		first_name = keyboard.next();
		System.out.print( "Second name:" );
		second_name = keyboard.next();
		System.out.print( "Grade:" );
		grade = keyboard.nextInt();
		System.out.print( "Student id=" );
		student_id= keyboard.nextInt();
		System.out.print( "Login:" );
		login= keyboard.next();
		System.out.print( "GPA:" );
		gpa= keyboard.nextDouble();
		System.out.println( "Your information:" );
		System.out.println( "Login:" + login );
		System.out.println( "ID:" + student_id );
		System.out.println( "Name:" + first_name + second_name );
		System.out.println( "GPA:" + gpa );
		System.out.println( "Grade: " + grade );
	}
}