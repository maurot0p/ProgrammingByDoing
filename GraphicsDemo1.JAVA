import java.awt.*;
import javax.swing.JFrame;

public class GraphicsDemo1 extends Canvas
{
    public void paint( Graphics g )
    {
        g.setColor(Color.green);
        g.drawRect(160,20,100,200);  // draw a rectangle . los 2 primeros numeros lo posicionan en el cuadro, los dos ultimos indican las dimensiones del rectangulo
        g.fillOval(160,20,100,200); // draw a filled-in oval. Los dos primeros lo posicionan,  los dos ultimos lo dimensionan
        g.setColor(Color.blue);
        g.fillRect(200,400,200,20); // a filled-in rectangle
        g.drawOval(200,430,200,100);
        g.setColor(Color.red);
        g.fillRect(500,430,100,100);
        
        g.setColor(Color.black);
        g.drawString("Graphics are pretty neat.", 500, 100); //numeros indican la posicion del string, 
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);
    }

    public static void main( String[] args )
    {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("GraphicsDemo1");
        win.setSize(800,600);  //this is the size of the window, JFrame 
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo1 canvas = new GraphicsDemo1();
        win.add( canvas );
        win.setVisible(true);
    }
}