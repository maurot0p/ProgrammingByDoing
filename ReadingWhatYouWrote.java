import java.util.Scanner;
import java.io.File; 
import java.util.*;
import java.io.*;
class Car
{
  String make;
  String model;
  String license_plate;
  int year;
}
public class ReadingWhatYouWrote{
	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in);
		Car[] cars = new Car[5];
		System.out.println("From which file to load information:");
		String filename= keyboard.next();
    File file = new File(filename);
    Scanner read = new Scanner(file); 
    System.out.println("Reading data from "+filename + "...");
    int j=0;
    	while (read.hasNext()) {
            cars[j] = new Car();
            cars[j].make= read.next();
            cars[j].model= read.next();
            cars[j].year= read.nextInt();
            cars[j].license_plate=read.next();
            j++;
            
      		}
      		read.close();

          for(int i=0; i<cars.length; i++)
            System.out.println("Car: " +(i+1) + ", Make:  " + cars[i].make + ", Model:" +cars[i].model + ", License plate:  " + cars[i].license_plate + ", Year:" +cars[i].year);

		
	}
}