import java.util.Scanner;

public class Keychains2
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int current_keychains=0;
		int price_keychains=10;
		System.out.println("THE OLD KEYCHAIN SHOP");
		System.out.println();
		System.out.println("CHOOSE WHAT YOU WANT TO DO");
		System.out.println("1) Add keychains to the order");
		System.out.println("2) Remove keychains to the order");
		System.out.println("3) View current order");
		System.out.println("4) Checkout");
		int choice = keyboard.nextInt();
		while(choice!=4)
		if(choice==1){
			current_keychains= add_keychains(current_keychains);
			System.out.println("You now have " +current_keychains+ " keys.");
			System.out.println("CHOOSE WHAT YOU WANT TO DO");
			choice = keyboard.nextInt();
		}
		else if(choice==2){
			current_keychains= remove_keychains(current_keychains);
			System.out.println("You now have " +current_keychains+ " keys.");
			System.out.println("CHOOSE WHAT YOU WANT TO DO");
			choice = keyboard.nextInt();
		}
		else if(choice==3){
			view_order(current_keychains,price_keychains);
			System.out.println("CHOOSE WHAT YOU WANT TO DO");
			choice = keyboard.nextInt();
		}
		checkout(current_keychains,price_keychains);
	}
public static int add_keychains(int x)              
{
	Scanner keyboard = new Scanner(System.in);
	System.out.println("You have " +x+ " keychains. How many keychains would you like to add");
	int keychains_add=keyboard.nextInt();
	x= keychains_add+x;
	return x;
}
public static int remove_keychains(int x)   
{
	Scanner keyboard = new Scanner(System.in);
	System.out.println("You have " +x+ " keychains. How many keychains would you like to remove");
	int keychains_remove=keyboard.nextInt();
	x= x- keychains_remove;
	return x;
}
public static void view_order(int x,int y)                  
{
	System.out.println("Number of keychains: " +x);
	System.out.println("Price per keychain: " +y);
	System.out.println("Total: " +(x*y));
}
public static void checkout(int x, int y)  
{	
	Scanner keyboard = new Scanner(System.in);
	System.out.print("What is your name? ");
	String name = keyboard.next();
	System.out.println("You have  " +x + " keychains");
	System.out.println("Keychains cost  " +y + " each.");
	System.out.println("Your total cost is: " +(x*y));
	System.out.println("Thanks for your order  " +name);
	
}
}