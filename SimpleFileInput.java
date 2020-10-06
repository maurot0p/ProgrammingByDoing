import java.io.*;
import java.awt.Desktop;  
public class SimpleFileInput{
    public static void main(String args[]) throws IOException{ 
    Desktop desktop = Desktop.getDesktop();
    File file = new File("C:\\Users\\mauri\\Documents\\name.txt.txt");
    desktop.open(file);
    }
}