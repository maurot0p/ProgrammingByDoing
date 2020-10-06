public class Euler002
{
	public static void main( String[] args )
	{
	
        int n = 4000000, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");
        int fibonacci[]= new int[];
        for (int i = 1; i <= n; ++i)
        {

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            fibonacci[i]=t1;

        }
        System.out.println(fibonacci);

}
}


