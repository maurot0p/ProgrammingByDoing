import java.util.Scanner;
import java.io.File; 
import java.util.*;
import java.io.*;
import java.lang.Float;
class Student
{
  int student;
  int grade_number;
  float grade;
  String letter_grade;
}
public class SortingRecordsOnTwoFields{
	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in);
		Student[] students = new Student[30];
		System.out.println("From which file to load information:");
		String filename= keyboard.next();
    File file = new File(filename);
    Scanner read = new Scanner(file); 
    System.out.println("Reading data from "+filename + "...");
    int i=0;
    	while (read.hasNext()) {
            students[i] = new Student();
            students[i].student= read.nextInt();
            students[i].grade_number= read.nextInt();
            students[i].grade= read.nextFloat();
            students[i].letter_grade= read.next();
            i++;           
      		}
      		read.close();

          Student tmp = new Student(); 
          float tmp2;

          for(int j=0; j<students.length; j++){
            for (int k=0; k<students.length;k++){
              if(students[j].student<students[k].student){
                tmp= students[j];
                students[j]=students[k];
                students[k]=tmp;
              }
              if((students[j].student == students[k].student && students[j].grade < students[k].grade)){
                 tmp2= students[j].grade;
                 students[j].grade=students[k].grade;
                 students[k].grade=tmp2;
                  }}
               
          }
          

          System.out.println( "Sorted values:");
          for(int l=0; l<students.length; l++)
            System.out.println( "\t"+  students[l].student + "\t " + students[l].grade_number + "\t" + students[l].grade + "\t" + students[l].letter_grade);


		
	}

}