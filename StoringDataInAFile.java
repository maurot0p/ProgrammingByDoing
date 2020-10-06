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
public class StoringDataInAFile{
	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in);
		Car[] cars = new Car[5];
    for(int i=0; i<cars.length; i++){
            System.out.println("Car "+ (i+1));
            cars[i] = new Car();
             System.out.print("Make: ");
      			cars[i].make= keyboard.next();
            System.out.print("Model: ");
      			cars[i].model= keyboard.next();
            System.out.print("License plate: ");
            cars[i].license_plate= keyboard.next();
            System.out.print("Year: ");
            cars[i].year= keyboard.nextInt();
          }

		System.out.println();
    System.out.print("\nTo which file do you want to save this information? ");
    String file_name = keyboard.next();
    File in = new File(file_name);
    FileWriter fw = new FileWriter(in);
    PrintWriter pw = new PrintWriter(fw);
    for(int j=0; j<cars.length; j++){
      pw.print(cars[j].make);
      pw.print("\t"+cars[j].model);
      pw.print("\t"+cars[j].year);
      pw.print("\t"+cars[j].license_plate);
      pw.println();
    }
    pw.close();
    System.out.println();
    System.out.println("Data saved.");

	}
}