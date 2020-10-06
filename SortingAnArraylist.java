import java.util.*;
import java.util.Scanner;
import java.util.Arrays; 
public class SortingAnArraylist{
	public static void main(String[] args){
	Random r = new Random();
	ArrayList<Integer> numbers = new ArrayList<Integer>(10);
    
    for(int i=0;i<10;i++){
         numbers.add(1+r.nextInt(50));}

    System.out.println(numbers);
   	Collections.sort(numbers);
    

 System.out.println( "The sorted list is " + numbers);
	}
}