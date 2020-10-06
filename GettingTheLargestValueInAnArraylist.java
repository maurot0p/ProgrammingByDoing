import java.util.*;
import java.util.Scanner;
import java.util.Arrays; 
public class GettingTheLargestValueInAnArraylist{
	public static void main(String[] args){
	Random r = new Random();
	ArrayList<Integer> numbers = new ArrayList<Integer>(10);
    int max=0;
    for(int j=0;j<10;j++){
         numbers.add(1+r.nextInt(50));}

    System.out.println(numbers);

 System.out.println("The biggest value is " + Collections.max(numbers));
	}
}