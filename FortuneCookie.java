import java.util.Random;
public class FortuneCookie
{
	public static void main( String[] args )
	{
Random r = new Random();
int secret_fortune = (1+ r.nextInt(6));
System.out.print("Yor fortune says: ");

if ( secret_fortune== 1)
System.out.println("You are gonna die pretty soon.");
else if ( secret_fortune== 2)
System.out.println("You get to live to see another day.");
else if ( secret_fortune== 3)
System.out.println("Your mother is very lovely.");
else if ( secret_fortune== 4)
System.out.println("Your father hates you.");
else if ( secret_fortune== 5)
System.out.println("I dont know what to tell you.");
else if ( secret_fortune== 6)
System.out.println("You are a jedi.");

System.out.print( 1 + r.nextInt(54) + "\t" );
System.out.print( 1 + r.nextInt(54) + "\t" );
System.out.print( 1 + r.nextInt(54) + "\t" );
System.out.print( 1 + r.nextInt(54) + "\t" );
System.out.print( 1 + r.nextInt(54) + "\t" );
System.out.print( 1 + r.nextInt(54) + "\t" );
System.out.println();

	}
}