import java.awt.*;
import javax.swing.JFrame;

public class SmilingFaceFunction extends Canvas
{
    public void paint( Graphics g )
    {
        drawSmilingFace(g,100,100);
        drawSmilingFace(g,400,350);
        drawSmilingFace(g,350,200);
        drawSmilingFace(g,200,450);
        drawSmilingFace(g,400,600);
        // etc
    }

    public void drawSmilingFace( Graphics g, int x, int y )
    {
        // Draws a smiling face on the screen, where the point (x,y) is
        //  the upper-left corner of a box containing the face.

        g.setColor(Color.WHITE);
        g.fillRect(x,y,100,100);

        g.setColor(Color.yellow);
        g.fillOval(x+20,y+20,50,50); // draw a filled-in oval

        g.setColor(Color.blue);
        g.fillOval(x+45,y+45,5,5);
        g.fillOval(x+65,y+45,5,5); 
          // para hacer un circulo centrado en X,Y tienes que restarle a la cordenada que restarle la mitad del diametro(el radio)
        g.setColor(Color.red);
        g.fillArc(x+30,y+55,30,8,0,-180); // draw an arc that starts at 0 degrees
                                         //   and has an arclength of 270 degrees


    }

    public static void main(String[] args)
    {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("Smiling Face Function");
        win.setSize(1024,768);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add( new SmilingFaceFunction() );
        win.setVisible(true);
    }

}