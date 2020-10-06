import java.util.*;
import java.util.Scanner;
import java.util.Arrays; 
public class BasicArraylists2{
	public static void main(String[] args){
	
	Random r = new Random();
	ArrayList<Integer> numbers = new ArrayList<Integer>(10);
    for(int j=0;j<10;j++){
         numbers.add(1+r.nextInt(100));}

    System.out.println("Array list: " +numbers );
    

   
    
    
	}
}