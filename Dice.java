import java.util.Random;
public class Dice
{
	public static void main( String[] args )
	{
Random r = new Random();
int dice_1 = (1+ r.nextInt(6));
int dice_2 = (1+ r.nextInt(6));
System.out.println("Roll #1: " +dice_1);
System.out.println("Roll #2: " +dice_2);

System.out.println("The total is " +(dice_1+dice_2)+ "!");

	}
}