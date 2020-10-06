import java.util.Scanner;

public class SafeSquareRoot
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		   
      double x;
      System.out.print("Give a number and ill give you the square root:");
      x= keyboard.nextDouble();
      while (x <0){
       System.out.println("Dont be silly, that is a negative number.");
  	   System.out.print("Try again:");
  	   x= keyboard.nextDouble();
  		}

  	 	System.out.println("The square root of " +x+ " is "+ Math.sqrt(x));
  		
   }
}