import java.util.Random;

public class SelectionSort
{
	public static void selection_sort( int[] a )
	{
		// Your code goes here
		int minIndex;
		
		
		for ( int i = 0; i < a.length; i++ )  //create a for loop that goes from index 0 to index n-1
		{
			minIndex = i;
			for ( int j = i + 1; j < a.length; j++ )
			{
				if ( a[j] < a[minIndex] )
					minIndex = j;
			}
			if ( minIndex != i )
				swap(a, i, minIndex); //esto es basicamente ir encontrando un minIndex nuevo cada vez...
		}
	}
	




	public static void swap( int[] a , int i, int j )
	{
		 int tmp = a[i];

         a[i] = a[j];

         a[j] = tmp;			
    }	


	public static void main( String[] args )
	{
		Random r = new Random();
		int[] arr = new int[10];
		int i;

		// Fill up the array with random numbers
		for ( i=0; i<arr.length; i++ )
			arr[i] = 1 + r.nextInt(100);

		// Display it
		System.out.print("before: ");
		for ( i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();

		// Sort it
		selection_sort( arr );

		// Display it again to confirm that it's sorted
		System.out.print("after : ");
		for ( i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
	}
}