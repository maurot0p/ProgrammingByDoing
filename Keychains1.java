import java.util.Scanner;

public class Keychains1
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

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
			add_keychains();
			System.out.println("CHOOSE WHAT YOU WANT TO DO");
			choice = keyboard.nextInt();
		}
		else if(choice==2){
			remove_keychains();
			System.out.println("CHOOSE WHAT YOU WANT TO DO");
			choice = keyboard.nextInt();
		}
		else if(choice==3){
			view_order();
			System.out.println("CHOOSE WHAT YOU WANT TO DO");
			choice = keyboard.nextInt();
		}
		checkout();
	}
public static void add_keychains()              
{
	System.out.println("ADD KEYCHAINS");
}
public static void remove_keychains()   
{
	System.out.println("REMOVE KEYCHAINS");
}
public static void view_order()                  
{
	System.out.println("VIEW ORDER");
}
public static void checkout()  
{
	System.out.println("CHECKOUT");
}
}