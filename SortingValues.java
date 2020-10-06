import java.util.Arrays;
import java.util.Collections;

public class SortingValues
{
	public static void main( String[] args )
	{
		int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };

		// Display the original (unsorted values)
		System.out.print("before: ");
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();

		// Swap the values around to put them ascending order.
		
		for (int j=0; j<arr.length;j++)
		{
			for (int k=0; k<arr.length;k++)
			{
				if (arr[j]<arr[k])
				{
					int remplazo=arr[j];
					arr[j]=arr[k];
					arr[k]=remplazo;
				}
			}
		}
		

		// Display the values again, now (hopefully) sorted.
		System.out.print("after : ");
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
	}
}