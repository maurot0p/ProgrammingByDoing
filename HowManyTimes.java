import java.util.*;
import java.util.Scanner;
import java.util.Arrays; 
public class HowManyTimes{
	public static void main(String[] args){
	int a[]=new int[10];
	Random r = new Random();
	Scanner keyboard = new Scanner(System.in);
	
	for(int i=0; i<a.length; i++){
		a[i] = 1 + r.nextInt(50);
		System.out.print(a[i]+" ");

	}
	System.out.println();
	System.out.println("Which value would you like to find?");
	int value= keyboard.nextInt();
	int j=0;			
            for(int n:a){
            			if(n==value)
            				j++;	
        }
        System.out.println(value + " was found  a total of " + j + " times");
	}
}