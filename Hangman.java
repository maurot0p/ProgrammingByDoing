import java.util.*;
import java.util.Arrays; 
import java.util.Scanner;
import java.io.*;
import java.lang.*;
public class Hangman{
	public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);
	String[] words = { "Water", "Koala", "Awesome", "Medicine" , "Kidney", "Ejaculation", "Programming" };
	Random r = new Random();
	String play_again;
	do{
	System.out.println("THIS IS HANGMAN... TRY TO GUESS THE WORD. YOU HAVE 13 TRIES");
	System.out.println();
	int random_word=r.nextInt(7);
	int tries=1;

	if(random_word==0){
		char letters[]=new char[words[0].length()];
		for(int i=0; i<words[0].length(); i++){
			System.out.print("__ ");
		}
		for(int j=0; j<words[0].length();j++){
			char arraymaterial= words[0].charAt(j);
			letters[j]=arraymaterial;
		}
		System.out.println("Guess a letter:");
		char guess = keyboard.next().charAt(0);
		for(int n=0;n<words[0].length();n++){
		if(guess==letters[n]){
			System.out.println("That letter was correct.");
			tries++;
		else if(guess!=letters[n])	
			tries++;
			System.out.println("That was a miss. You have "+(14-tries) + " tries left ");


		}}

}

	
	
	System.out.println();
	System.out.println("Play \"again\" or \"quit\"?");
	play_again= keyboard.next();
	}while(play_again.equalsIgnoreCase("again"));

	
	
}



}