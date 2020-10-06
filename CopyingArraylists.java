import java.util.*;
import java.util.Scanner;
import java.util.Arrays; 
public class CopyingArraylists{
	public static void main(String[] args){
	
	Random r = new Random();
	ArrayList<Integer> numbers = new ArrayList<Integer>();
    for(int j=0;j<10;j++){
         numbers.add(1+r.nextInt(100));}
    List<Integer> new_list = new ArrayList<>(numbers);
    numbers.set(9,-7);
    System.out.println("Array list: " +numbers );
    System.out.println("Array list: " +new_list );
    

   
    
    
	}
}