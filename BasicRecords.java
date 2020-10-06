import java.util.Scanner;

class Student
{
	String name;
	int grade;
	Double  average;
}

public class BasicRecords
{
	public static void main(String[] args) throws Exception
	{
		
		Scanner keyboard = new Scanner(System.in);

		Student uno = new Student();
		System.out.print("First student name: ");
		uno.name = keyboard.next();
		System.out.println("First student grade:");
		uno.grade   = keyboard.nextInt();
		System.out.println("First student average:");
		uno.average  = keyboard.nextDouble();
	

		Student dos = new Student();
		System.out.print("Second student name: ");
		dos.name = keyboard.next();
		System.out.println("Second student grade:");
		dos.grade   = keyboard.nextInt();
		System.out.println("Second student average:");
		dos.average  = keyboard.nextDouble();
		
		Student tre = new Student();
		System.out.print("Third student name: ");
		tre.name = keyboard.next();
		System.out.println("Third student grade:");
		tre.grade   = keyboard.nextInt();
		System.out.println("Third student average:");
		tre.average  = keyboard.nextDouble();
		
		
		System.out.println();	
		System.out.println("The names are "+ uno.name+ " "+ dos.name  + " and  " + tre.name);
		System.out.println("The grades are "+ uno.grade+ " "+ dos.grade  + " and  " + tre.grade);
		System.out.println("The averages are "+ uno.average+ " "+ dos.average  + " and  " + tre.average);
		System.out.println();	
		System.out.println("The average for all three students is " + ((uno.average+dos.average+tre.average)/3));

	}
}
