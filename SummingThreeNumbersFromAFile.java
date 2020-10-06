// Java Program to illustrate reading from Text File 
// using Scanner Class 
import java.io.File; 
import java.util.Scanner; 
public class SummingThreeNumbersFromAFile 
{ 
public static void main(String[] args) throws Exception 
{ 
	// pass the path to the file as a parameter 
	File file = new File("C:\\Users\\mauri\\Documents\\3nums.txt"); 
	Scanner keyboard = new Scanner(file); 
	System.out.println("Reading integers from 3nums txt....");  
	int n1= keyboard.nextInt();
	int n2= keyboard.nextInt();
	int n3= keyboard.nextInt();
	int sum= n1+n2+n3;
	System.out.println(n1 + "+" +n2 +"+"+n3 + "=" + sum);

} 
} 
