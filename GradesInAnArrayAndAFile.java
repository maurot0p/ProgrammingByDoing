import java.util.*;
import java.util.Scanner;
import java.io.File; 
import java.io.*;
import java.util.Arrays;
public class GradesInAnArrayAndAFile{
	public static void main(String[] args) throws IOException{
	

	Scanner keyboard = new Scanner(System.in);	
	System.out.println("Name( first last ): ");
	String name= keyboard.next();
	System.out.println("Filename: ");
	String filename= keyboard.next();

	File grade = new File(filename);
    FileWriter fw =new FileWriter(grade);
    PrintWriter pw = new PrintWriter(fw);
    int grades[]=new int[5];
	Random r = new Random();

	
	System.out.println("Here are some randomly selected grades:");

	for(int i=0; i<grades.length; i++){
		grades[i] = 1 + r.nextInt(100);
		System.out.println("Grade " +i + ": " + grades[i]);
		}
	System.out.println("Data saved in " +filename);
	pw.println(Arrays.toString(grades));
	pw.println(name);
	pw.close();
		}
}