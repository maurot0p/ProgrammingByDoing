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
public class SortingStrings{
	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in);
		Car[] cars = new Car[5];
		System.out.println("From which file to load information:");
		String filename= keyboard.next();
    File file = new File(filename);
    Scanner read = new Scanner(file); 
    System.out.println("Reading data from "+filename + "...");
    int i=0;
    	while (read.hasNext()) {
            cars[i] = new Car();
            cars[i].make= read.next();
            cars[i].model= read.next();
            cars[i].year= read.nextInt();
            cars[i].license_plate=read.next();
            i++;
            
      		}
      		read.close();

          Car tmp = new Car(); 

          for(int j=0; j<cars.length; j++){
            for (int k=0; k<cars.length;k++)
              if(cars[j].make.compareTo(cars[k].make)<0){
                tmp= cars[j];
                cars[j]=cars[k];
                cars[k]=tmp;}
          }
          for(int l=0; l<cars.length; l++)
            System.out.println("Car #1: \t" + cars[l].make + " " + cars[l].model + " " + cars[l].year + " " + cars[l].license_plate);


		
	}
}