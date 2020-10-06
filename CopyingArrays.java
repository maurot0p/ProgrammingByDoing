import java.util.*;
public class CopyingArrays{
	public static void main(String[] args){
	int a[]=new int[10];
	int b[]= new int[10];
	Random r = new Random();
	System.out.print("Array 1: ");
	for(int i=0; i<a.length; i++){
		a[i] = 1 + r.nextInt(100);
		a[9]= -7;
		System.out.print(a[i]+ " ");
		System.arraycopy(a, 0, b, 0, 9);
	}
	System.out.println();
	System.out.print("Array 2: ");
	for(int j=0; j<b.length;j++){
		b[9]= 1 + r.nextInt(100);
	System.out.print(b[j]+" ");
	}
		}
}