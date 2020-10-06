import java.net.URL;
import java.util.Scanner;

class Address
{
	String street;
	String city;
	String state;
	int zip;
}

public class WebAddressesArray
{
	public static void main(String[] args) throws Exception
	{

		Address[] addybook = new Address[5];

		Scanner keyboard = new Scanner(System.in);

		for ( int i=0; i<addybook.length; i++ )
		{
			addybook[i] = new Address();
			addybook[i].street = keyboard.nextLine();
			addybook[i].city   = keyboard.nextLine();
			addybook[i].state  = keyboard.next();
			addybook[i].zip    = keyboard.nextInt();	
		}
	
		
		for ( int i=0; i<addybook.length; i++ )
		{
			System.out.println((i+1) + ". " + addybook[i].street + ", " + addybook[i].city + ", " + addybook[i].state + "  " + addybook[i].zip);
		}
	}
}
