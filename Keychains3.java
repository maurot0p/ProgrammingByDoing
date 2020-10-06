import java.util.Scanner;

public class Keychains3
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int current_keychains=0;
		int price_keychains=10;
		Double sales_tax=0.0825;
		int shipping_cost=5;
		int additional_shipping=1;
		System.out.println("THE OLD KEYCHAIN SHOP");
		System.out.println();
		System.out.println("CHOOSE WHAT YOU WANT TO DO");
		System.out.println("1) Add keychains to the order");
		System.out.println("2) Remove keychains to the order");
		System.out.println("3) View current order");
		System.out.println("4) Checkout");
		int choice = keyboard.nextInt();
		while(choice<=3 && choice>0)
		if(choice==1&&current_keychains>=0){
			current_keychains= add_keychains(current_keychains);
			System.out.println("You now have " +current_keychains+ " keys.");
			System.out.println("CHOOSE WHAT YOU WANT TO DO");
			choice = keyboard.nextInt();
		}
		else if(choice==2&&current_keychains>=0){
			current_keychains= remove_keychains(current_keychains);
			System.out.println("You now have " +current_keychains+ " keys.");
			System.out.println("CHOOSE WHAT YOU WANT TO DO");
			choice = keyboard.nextInt();
		}
		else if(choice==3&&current_keychains>=0){
			view_order(current_keychains,price_keychains,  sales_tax, shipping_cost, additional_shipping);
			System.out.println("CHOOSE WHAT YOU WANT TO DO");
			choice = keyboard.nextInt();
		}
		else{
			System.out.println("ERROR. CHOOSE AGAIN");
			choice = keyboard.nextInt();
		}

		checkout(current_keychains,price_keychains, sales_tax, shipping_cost, additional_shipping );
	}
public static int add_keychains(int x)              
{
	Scanner keyboard = new Scanner(System.in);
	System.out.println("You have " +x+ " keychains. How many keychains would you like to add");
	int keychains_add=keyboard.nextInt();
	x= keychains_add+x;
		if(x<0){
			System.out.println("That shit is negative, you better choose again");	
			keychains_add=keyboard.nextInt();
		}
	return x;
}
public static int remove_keychains(int x)   
{
	Scanner keyboard = new Scanner(System.in);
	System.out.println("You have " +x+ " keychains. How many keychains would you like to remove");
	int keychains_remove=keyboard.nextInt();
	while (keychains_remove<0||(x- keychains_remove)<0){
			System.out.println("That shit is negative, you better choose again");	
			keychains_remove=keyboard.nextInt();
		}
	x= x- keychains_remove;
	return x;
}
public static void view_order(int x,int y, Double z, int a, int b)                  
{
	System.out.println("Number of keychains: " +x);
	System.out.println("Price per keychain: " +y);
	System.out.println("Normal shipping cost is "+a+ "For every additional keychain its one more dollar so your shipping total is " +(a+((b*x))));
	System.out.println("Your subtotal is: " +((x*y)+(a+((b*x)))));
	System.out.println("Your total after tax is: " + ( ((((x*y)+(a+b)))*z) + ((x*y)+(a+b)) ));
}
public static void checkout(int x, int y, Double z, int a, int b)  
{	
	Scanner keyboard = new Scanner(System.in);
	System.out.print("What is your name? ");
	String name = keyboard.next();
	System.out.println("You have  " +x + " keychains");
	System.out.println("Keychains cost  " +y + " each.");
	System.out.println("Normal shipping cost is "+a+ "For every additional keychain its one more dollar so your shipping total is " +(a+((b*x))));
	System.out.println("Your subtotal is: " +((x*y)+(a+((b*x)))));
	System.out.println("Your total after tax is: " +( ( (((x*y)+(a+((b*x)))))*z) + ((x*y)+(a+((b*x)))) ));
	System.out.println("Thanks for your order  " +name);
	
}
}