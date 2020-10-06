import java.util.Scanner;
public class ParallelArrays
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String[] names = { "Guzman", "Oller", "Nova", "Vargas" , "Martinez" };
		Double[]grades = {91.7, 92.2, 93.6, 86.2, 91.2};
		int[] studentid = {10135854,10132323,10135231,10135234,10135855};

		System.out.println("Values");
		System.out.println(names[0] + " " + grades[0] + " " + studentid[0]);
		System.out.println(names[1] + " " + grades[1] + " " + studentid[1]);
		System.out.println(names[2] + " " + grades[2] + " " + studentid[2]);
		System.out.println(names[3] + " " + grades[3] + " " + studentid[3]);
		System.out.println(names[4] + " " + grades[4] + " " + studentid[4]);

		System.out.println();
		System.out.println("Which ID number would you like to find: ");
		int idtofind= keyboard.nextInt();
		for(int i=0; i<studentid.length; i++){
			if(idtofind==studentid[i]){
				System.out.println("That ID was found in slot " + i);
				System.out.println(names[i]);
				System.out.println(grades[i]);}
		}
		

	

	}
}