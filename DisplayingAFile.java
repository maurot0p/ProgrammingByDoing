import java.io.*;

import java.util.Scanner;
public class DisplayingAFile{
    public static void main(String args[]) throws IOException{ 
    
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Open which file:");
    String filename= keyboard.next();
    File file = new File(filename);
    Scanner read = new Scanner(file); 
    while (read.hasNextLine()) 
      System.out.println(read.nextLine());
    }
}