import java.io.*;
import java.util.Scanner;
public class HighScore{
    public static void main(String args[]) throws IOException{
    Scanner keyboard = new Scanner(System.in);  
    File score = new File("score.txt");
    FileWriter fw =new FileWriter(score);
    PrintWriter pw = new PrintWriter(fw);
    System.out.println("You got a HighScore!");
    System.out.print("Please enter your score:");
    int num= keyboard.nextInt();
    System.out.print("Please enter your name:");
    String name= keyboard.next();

        pw.println(num);
        pw.println(name);
        pw.close();
    }
}