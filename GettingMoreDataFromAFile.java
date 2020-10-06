import java.util.Scanner;
import java.io.File; 
import java.util.*;
import java.io.*;
class Person
{
	String name;
	int age;
}
public class GettingMoreDataFromAFile{
	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in);
		Person[] persons = new Person[5];
		System.out.println("Open which file:");
		String filename= keyboard.next();
    File file = new File(filename);
    Scanner read = new Scanner(file); 
    System.out.println("Reading data from "+filename + "...");
    	while (read.hasNext()) {
            persons[0] = new Person();
      			persons[0].name= read.next();
      			persons[0].age= read.nextInt();
            persons[1] = new Person();
      			persons[1].name= read.next();
            persons[1].age= read.nextInt();
            persons[2] = new Person();
            persons[2].name= read.next();
            persons[2].age= read.nextInt();
            persons[3] = new Person();
            persons[3].name= read.next();
            persons[3].age= read.nextInt();
            persons[4] = new Person();
            persons[4].name= read.next();
            persons[4].age= read.nextInt();

      		}
      		read.close();

          for(int i=0; i<persons.length; i++)
            System.out.println("Person: " +(i+1) + ", name:  " + persons[i].name + ", age:" +persons[i].age);

		
	}
}