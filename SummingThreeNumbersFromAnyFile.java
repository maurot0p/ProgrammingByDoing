import java.io.File; 
import java.util.Scanner; 
public class SummingThreeNumbersFromAnyFile 
{ 
public static void main(String[] args) throws Exception 
{ 
	// pass the path to the file as a parameter 
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Which File would like to read numbers from? ");  
	String filename= keyboard.next();
	if(filename.equalsIgnoreCase("3nums1.txt"))
	{
	File file = new File("C:\\Users\\mauri\\Documents\\3nums1.txt"); 
	Scanner read = new Scanner(file); 
	int n1= read.nextInt();
	int n2= read.nextInt();
	int n3= read.nextInt();
	int sum= n1+n2+n3;
	System.out.println(n1 + "+" +n2 +"+"+n3 + "=" + sum);}
	else if(filename.equalsIgnoreCase("3nums2.txt"))
	{
	File file = new File("C:\\Users\\mauri\\Documents\\3nums2.txt"); 
	Scanner read = new Scanner(file); 
	int n1= read.nextInt();
	int n2= read.nextInt();
	int n3= read.nextInt();
	int sum= n1+n2+n3;
	System.out.println(n1 + "+" +n2 +"+"+n3 + "=" + sum);}
	else if(filename.equalsIgnoreCase("3nums3.txt"))
	{
	File file = new File("C:\\Users\\mauri\\Documents\\3nums3.txt"); 
	Scanner read = new Scanner(file); 
	int n1= read.nextInt();
	int n2= read.nextInt();
	int n3= read.nextInt();
	int sum= n1+n2+n3;
	System.out.println(n1 + "+" +n2 +"+"+n3 + "=" + sum);}

	else
		System.out.println("That file name is not available.");


} 
} 