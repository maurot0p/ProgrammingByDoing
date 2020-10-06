import java.util.Scanner;

public class EnterPIN
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;

		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();

		while ( entry != pin )     //if se parece a while en el hecho de que te compara 2 variables, y mientra siga pasando tal cosa te va seguir dando algo
		{							// if difier de while, en que if solo imprime una vez, while lo sigue haciendo mientras esa variable no cambie.
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt(); //aqui no hay un int antes pq es la misma variable de antes, solo que le asignaremos otro valor.
		}

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}
}