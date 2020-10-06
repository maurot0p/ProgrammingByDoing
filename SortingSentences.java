import java.util.*;
import java.util.Scanner;
import java.util.Arrays; 
public class SortingSentences{
	public static void main(String[] args){

	Scanner keyboard= new Scanner(System.in);
	System.out.println("Give me a sentence:");
	String sentence = keyboard.nextLine();
	String words[]=sentence.toLowerCase().split(" ");
	ArrayList<String> wordslist = new ArrayList<String>();

   
   for(int i=0; i<words.length; i++){
   	wordslist.add(words[i]);
   	}
   	Collections.sort(wordslist);
   	System.out.println(wordslist);
	}


	public static String string_generator(){
	String characters= "abcdefghijklmnopqrstuvwxyz";
	String randomstring= "";
	int length=5;
	Random r = new Random();

		for(int i=0; i<length;i++ ){
			randomstring+= characters.charAt(r.nextInt(26));
		}
		return randomstring;
	}
}