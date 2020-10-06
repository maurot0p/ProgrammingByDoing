import java.util.Scanner;

public class SchoolReport
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String first_name, second_name, login;
		int age, grade, student_id,;
		double gpa;

		System.out.print( "First name: " );
		first_name = keyboard.next();
		System.out.print( "Second name:" );
		second_name = keyboard.next();
		System.out.print( "Grade:" );
		grade = keyboard.nextInt();
		System.out.print( "Student id=" );
		student_id= keyboard.nextDouble()
		System.out.print( "Login:" );
		login= keyboard.next()
		System.out.print( "GPA:" );
		gpa= keyboard.nextDouble()
		System.out.print( "Your information:" );
		System.out.print( "Login:" + login );
		System.out.print( "ID:" + student_id );
		System.out.print( "Name:" + first_name + second_name );
		System.out.print( "GPA:" + gpa );
		System.out.print( "Grade: " + grade );
	}
}