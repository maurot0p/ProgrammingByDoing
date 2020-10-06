import java.util.Scanner;

public class WeekdayCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
		System.out.println();
		System.out.println("All you have to do is enter your birth date, and it will");
		System.out.println("tell you the day of the week on which you were born.");
		System.out.println();
		System.out.println("Some automatic tests....");
		System.out.println("12 10 2003 => " + weekday(12,10,2003));
		System.out.println(" 2 13 1976 => " + weekday(2,13,1976));
		System.out.println(" 2 13 1977 => " + weekday(2,13,1977));
		System.out.println(" 7  2 1974 => " + weekday(7,2,1974));
		System.out.println(" 1 15 2003 => " + weekday(1,15,2003));
		System.out.println("10 13 2000 => " + weekday(10,13,2000));
		System.out.println();

		System.out.println("Now it's your turn!  What's your birthday?");
		System.out.print("Birth date (mm dd yyyy): ");
		int mm = keyboard.nextInt();
		int dd = keyboard.nextInt();
		int yyyy = keyboard.nextInt();

		// put a function call for weekday() here
		System.out.println("You were born on " + weekday(mm,dd,yyyy) +"!" );
	}


	public static String weekday( int mm, int dd, int yyyy )
	{
		int yy, total;
		String date = "";
		yy= yyyy-1900;
		
			if(is_leap(yyyy)==true && mm<=2)
				total= (yy/4)+yy+dd+month_offset(mm) -1 ;
			else
				total= (yy/4)+yy+dd+month_offset(mm);

		int remainder=total%7;

		weekday_name(remainder);
		

		date = weekday_name(remainder) + month_name(mm) + dd+ ", " + yyyy;

		return date;
	}

	public static String month_name( int month )
	{
		String monthname= "";
		if( month== 1)
			monthname= "January";
		else if( month== 2)
			monthname= "February";
		else if( month== 3)
			monthname= "March";
		else if( month== 4)
			monthname= "April" ;
		else if( month== 5)
			monthname= "May";
		else if( month== 6)
			monthname= "June";
		else if( month== 7)
			monthname= "July";
		else if( month== 8)
			monthname= "August";
		else if( month== 9)
			monthname= "September";
		else if( month== 10)
			monthname= "October";
		else if( month== 11)
			monthname= "November";
		else if( month== 12)
			monthname= "December";
		else
			monthname= "There is not such month";
		// Your code goes in here.

		return monthname;
	}
	public static int month_offset( int month )
	{
		int offset;
		// Your code goes in here.
		if( month== 1)
			offset= 1;
		else if( month== 2)
			offset= 2;
		else if( month== 3)
			offset= 4;
		else if( month== 4)
			offset= 0 ;
		else if( month== 5)
			offset= 2;
		else if( month== 6)
			offset= 5;
		else if( month== 7)
			offset= 0;
		else if( month== 8)
			offset= 3;
		else if( month== 9)
			offset= 6;
		else if( month== 10)
			offset= 1;
		else if( month== 11)
			offset= 4;
		else if( month== 12)
			offset= 6;
		else
			offset= -1;
		
		return offset;
	}
public static String weekday_name( int weekday )
	{
		String result = "";


		if ( weekday == 1 )
		{
			result = "Sunday";
		}
		else if ( weekday == 2 )
		{
			result = "Monday";
		}
		else if ( weekday == 3 )
		{
			result = "Tuesday";
		}
		else if ( weekday == 4 )
		{
			result = "Wednesday";
		}
		else if ( weekday == 5 )
		{
			result = "Thursday";
		}
		else if ( weekday == 6 )
		{
			result = "Friday";
		}
		else if ( weekday == 7 )
		{
			result = "Saturday";
		}
		else if (weekday== 0)
		{
			result = "Saturday";
		}
		
		return result;
	}

	// paste your functions from MonthName, WeekdayName, and MonthOffset here

	public static boolean is_leap ( int year )
	{
		boolean result;

		if ( year%400 == 0 )
			result = true;
		else if ( year%100 == 0 )
			result = false;
		else if ( year%4 == 0 )
			result = true;
		else
			result = false;
		
		return result;

	}
}