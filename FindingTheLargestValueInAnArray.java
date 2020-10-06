import java.util.*;
import java.util.Scanner;
import java.util.Arrays; 
public class FindingTheLargestValueInAnArray{
	public static void main(String[] args){
	int a[]=new int[10];
	Random r = new Random();
	Scanner keyboard = new Scanner(System.in);
	
	for(int i=0; i<a.length; i++){
		a[i] = 1 + r.nextInt(100);
		System.out.print(a[i]+" ");
	}
	Arrays.sort(a);
	System.out.print(" The biggest value is " +a[9]);
}
}
