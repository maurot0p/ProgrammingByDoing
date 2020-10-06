import java.util.*;
import java.util.Scanner;
import java.util.Arrays; 
public class FindingAValueInAnArraylist{
	public static void main(String[] args){
	Scanner keyboard= new Scanner(System.in);
	Random r = new Random();
	ArrayList<Integer> numbers = new ArrayList<Integer>(10);
    for(int j=0;j<10;j++){
         numbers.add(1+r.nextInt(50));}
    System.out.println(numbers);
    System.out.println("Value to find:");
    int value= keyboard.nextInt();
    if(numbers.contains(value))
            System.out.println(value + " is in the arraylist.");
    
    
	}
}