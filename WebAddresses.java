
import java.util.Scanner;

class Address
{
	String street;
	String city;
	String state;
	int zip;
}

public class WebAddresses
{
	public static void main(String[] args) throws Exception
	{
		
		Scanner keyboard = new Scanner(System.in);

		Address uno = new Address();
		System.out.println("What is the name of your street?");
		uno.street = keyboard.nextLine();
		System.out.println("What is the name of your city?");
		uno.city   = keyboard.nextLine();
		System.out.println("What is the name of your state?");
		uno.state  = keyboard.nextLine();
		System.out.println("What is your zip code?");
		uno.zip    = keyboard.nextInt();
		

		Address dos = new Address();
		System.out.println("What is the name of your street?");
		dos.street = keyboard.nextLine();
		System.out.println("What is the name of your city?");
		dos.city   = keyboard.nextLine();
		System.out.println("What is the name of your state?");
		dos.state  = keyboard.nextLine();
		System.out.println("What is your zip code?");
		dos.zip    = keyboard.nextInt();
		
		Address tre = new Address();
		System.out.println("What is the name of your street?");
		tre.street = keyboard.nextLine();
		System.out.println("What is the name of your city?");
		tre.city   = keyboard.nextLine();
		System.out.println("What is the name of your state?");
		tre.state  = keyboard.nextLine();
		System.out.println("What is your zip code?");
		tre.zip    = keyboard.nextInt();
		
		
		
		
		System.out.println(uno.street + ", " + uno.city + ", " + uno.state + "  " + uno.zip);
		System.out.println(dos.street + ", " + dos.city + ", " + dos.state + "  " + dos.zip);
		System.out.println(tre.street + ", " + tre.city + ", " + tre.state + "  " + tre.zip);
	}
}
