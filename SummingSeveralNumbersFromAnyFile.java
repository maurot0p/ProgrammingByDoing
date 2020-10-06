import java.io.File; 
import java.util.Scanner; 
public class SummingSeveralNumbersFromAnyFile  
{ 
public static void main(String[] args) throws Exception 
{ 
	// pass the path to the file as a parameter 
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Which File would like to read numbers from? ");  
	String filename= keyboard.next();
	if(filename.equalsIgnoreCase("6nums.txt"))
	{
	File file = new File("C:\\Users\\mauri\\Documents\\6nums.txt"); 
	Scanner read = new Scanner(file); 
	int sum=0;
	while (read.hasNextInt()) {
  	int num= read.nextInt();
	sum=num+sum;
	}
	System.out.println("The total is " + sum);
	}
	else if(filename.equalsIgnoreCase("7nums.txt"))
	{
	File file = new File("C:\\Users\\mauri\\Documents\\7nums.txt"); 
	Scanner read = new Scanner(file); 
	int sum=0;
	while (read.hasNextInt()) {
  	int num= read.nextInt();
  	System.out.println(num + " ");
	sum=num+sum;
	}
	System.out.println("The total is " + sum);
	}
	else if(filename.equalsIgnoreCase("8nums.txt"))
	{
	File file = new File("C:\\Users\\mauri\\Documents\\8nums.txt"); 
	Scanner read = new Scanner(file); 
	int sum=0;
	while (read.hasNextInt()) {
  	int num= read.nextInt();
	sum=num+sum;
	}
	System.out.println("The total is " + sum);
	}

	else
		System.out.println("That file name is not available.");


} 
} 