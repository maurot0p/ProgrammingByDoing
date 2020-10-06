import java.util.Scanner;

public class Refresher
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" What is your name? ");
		String name = keyboard.next();
		for(int x=0; x<=10; x++){
			System.out.println(name);
			if(name.equalsIgnoreCase("Mitchell")) {
			System.out.println(name);
			System.out.println(name);
			System.out.println(name);
			System.out.println(name);
			System.out.println(name);
			break;
			}
		}
	}
}