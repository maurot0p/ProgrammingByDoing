import java.util.*;
import java.util.Scanner;
import java.util.Arrays; 
public class BasicArraylists3{
	public static void main(String[] args){
	
	Random r = new Random();
	ArrayList<Integer> numbers = new ArrayList<Integer>(1000);
    for(int j=0;j<1000;j++){
         numbers.add(10+r.nextInt(90));}

    System.out.println("Array list: " +numbers );
    

   
    
    
	}
}