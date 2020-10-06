import java.util.Scanner;
import java.io.File; 
import java.util.*;
import java.io.*;
class Dog
{
	String breed;
	int age;
	Double weight;
}
public class GettingDataFromAFile{
	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in);
		Dog first_dog = new Dog();
		Dog second_dog= new Dog();
		System.out.println("Open which file:");
		String filename= keyboard.next();
    	File file = new File(filename);
    	Scanner read = new Scanner(file); 
    	System.out.println("Reading data from "+filename + "...");
    	while (read.hasNext()) {
      			first_dog.breed= read.next();
      			first_dog.age= read.nextInt();
      			first_dog.weight= read.nextDouble();
      			second_dog.breed= read.next();
      			second_dog.age= read.nextInt();
      			second_dog.weight= read.nextDouble();

      		}
      		read.close();

      		System.out.println("First dog: " +first_dog.breed + " age " +first_dog.age + " " +first_dog.weight + " lbs.");
      		System.out.println("Second dog: " +second_dog.breed + " age " +second_dog.age + " " +second_dog.weight + " lbs.");


		
	}
}