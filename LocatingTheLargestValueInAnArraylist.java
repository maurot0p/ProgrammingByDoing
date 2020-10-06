import java.util.*;
import java.util.Scanner;
import java.util.Arrays; 
public class LocatingTheLargestValueInAnArraylist{
	public static void main(String[] args){
	Random r = new Random();
	ArrayList<Integer> numbers = new ArrayList<Integer>(10);
    
    for(int j=0;j<10;j++){
         numbers.add(1+r.nextInt(50));}

    System.out.println(numbers);
    int max= Collections.max(numbers);

 System.out.println("The biggest value is " +max  + " and its in spot " + numbers.indexOf(max) );
	}
}