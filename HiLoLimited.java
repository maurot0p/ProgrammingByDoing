import java.util.Random;
import java.util.Scanner;
public class HiLoLimited
{
	public static void main( String[] args )
	{
Scanner keyboard = new Scanner(System.in);
Random r = new Random();
int number = (1+ r.nextInt(100));
int guess;
int tries=1;
System.out.println( "I'm thinking of a number between 1-100. You have 7 guesses." );
System.out.print( "First guess: " );
guess = keyboard.nextInt();
           	while ( guess != number && tries < 7 )
           		 {
                if ( guess > number ) {
                    System.out.println( "Sorry, your guess is too high." );
                }
                
                if ( guess < number )
                 {
                    System.out.println( "Sorry, your guess is too low." );
                }
                
                tries++;
                
                System.out.print( "Guess #" + tries + ":" );
                guess = keyboard.nextInt();
            }
            
            if ( guess != number ) {
                System.out.println( "Sorry, you didn't guess it in 7 tries. You lose." );
            }
            
            if ( guess == number ) {
                System.out.println( "Wow, you got it in only " + tries + " tries! What are the odds!" );
            }
            
        }
    }
    