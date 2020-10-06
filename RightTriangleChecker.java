import java.util.Scanner;

public class RightTriangleChecker
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		   
      int side_1, side_2, side_3;
      System.out.println("Enter three integers");
      System.out.print("Side 1:");
      side_1= keyboard.nextInt();
      System.out.print("Side 2:");
      side_2= keyboard.nextInt();
      while (side_2 <side_1){
       System.out.println(+side_2+ " is smaller than "+side_1+ ". Try again" );
  	   side_2= keyboard.nextInt();
  		}
      System.out.print("Side 3:");
      side_3= keyboard.nextInt();
     while (side_3 <side_2){
       System.out.println(+side_3+ " is smaller than "+side_2+ ". Try again" );
       side_3= keyboard.nextInt();
      }

  	 	System.out.println("Your three sides are " +side_1 + "," + side_2 + " and " +side_3);
      if((side_1<=side_2) && (side_2<=side_3))
      System.out.println("Yes!, these sides add up to a right triangle ");		
   }
}