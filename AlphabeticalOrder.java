import java.util.Scanner;
public class AlphabeticalOrder
{
	public static void main( String[] args )
	{
Scanner keyboard = new Scanner(System.in);
String last_name;
System.out.print("Whats your last name? ");
last_name = keyboard.next();

if (last_name.compareTo("Carswell") <=0 )
	System.out.println("You don't have to wait long" +last_name+ " .");

else if(last_name.compareTo("Jones") <=0)
		System.out.println("Thats not bad" +last_name+ " .");
else if(last_name.compareTo("Smith") <=0)
	System.out.println("Looks like a bit of a wait" +last_name+ " .");
else if(last_name.compareTo("Young") <=0)
	System.out.println("Oh its gonna be a while" +last_name+ " .");
else if(last_name.compareTo("Young") >0)
	System.out.println("Not going anywhere for a while" +last_name+ " .");
	}
}