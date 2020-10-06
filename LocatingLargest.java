import java.util.*;
import java.util.Arrays; 
public class LocatingLargest{
	public static void main(String[] args){
	int a[]=new int[10];
	Random r = new Random();

	for(int i=0; i<a.length; i++){
		a[i] = 1 + r.nextInt(100);
		System.out.print(a[i]+" ");
	}
	int max=0;
	int spot=0;
	for(int j=0;j<10; j++){
		if(a[j]>max){
			max=a[j];
			spot=j;
		}	
	}
	System.out.println();
	System.out.println("The biggest value is " +  max + " and its in spot " +spot  );
	
}
}