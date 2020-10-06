import java.util.*;
import java.util.Scanner;
import java.util.Arrays; 
public class SortingAnArraylistOfStrings{
	public static void main(String[] args){
	ArrayList<String> words = new ArrayList<String>(10);
    
    for(int i=0;i<10;i++){
         words.add(string_generator());}

    System.out.println(words);

    Collections.sort(words);

    System.out.println(words);

   

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