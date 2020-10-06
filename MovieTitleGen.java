import java.net.URL;
import java.util.Scanner;

public class MovieTitleGen
{
	public static void main(String[] args) throws Exception
	{

		String[] adjectives = {"Awful", "Glorious", "Amazing", "Wonderful", "Insane", "Lavish"};
		String[] nouns      = {"Dog", "Teacher", "Father", "Priest", "Pope","Church", "Spouse"};

		System.out.println("Mitchell's Random Movie Title Generator\n");

		System.out.print("Choosing randomly from " + adjectives.length + " adjectives ");
		System.out.println("and " + nouns.length + " nouns (" + (adjectives.length*nouns.length) + " combinations).");

		String adjective = adjectives[(int)(Math.random()*adjectives.length)];  //la mejor manera que he encontrado de elegir random de un array.
		String noun = nouns[(int)(Math.random()*nouns.length)]; 

		System.out.println( "Your movie title is: " + adjective + " " + noun );
	}


}