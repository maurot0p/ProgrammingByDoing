import java.util.Scanner;
import java.io.File; 
import java.util.*;
import java.io.*;
import java.util.Arrays; 
class Car
{
  String make;
  String model;
  String license_plate;
  int year;
  public String toString()
  {
    return (this.make + ", " + this.model + "  " + this.license_plate + ", " +this.year);
  }                           
}
public class SortingAnArraylistOfRecords{
	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in);
		ArrayList<Car> cars = new ArrayList<Car>();
		System.out.println("From which file to load information:");
		String filename= keyboard.next();
    File file = new File(filename);
    Scanner read = new Scanner(file); 
    System.out.println("Reading data from "+filename + "...");
    int j=0;
    	while (read.hasNext()) {
            cars.add(new Car());
            cars.get(j).make= read.next();
            cars.get(j).model= read.next();
            cars.get(j).year= read.nextInt();
            cars.get(j).license_plate=read.next();
            j++;
            
      		}
      		read.close();
          
          for(int l=0; l<cars.size(); l++){
            for (int k=0; k<cars.size();k++)
              if(cars.get(l).year>cars.get(k).year){
                cars.set(l,cars.get(k));
                cars.set(k,cars.get(l));
          }}

            System.out.println(cars);

		
	}
}