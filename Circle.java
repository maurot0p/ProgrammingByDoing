import java.awt.*;
import javax.swing.JFrame;
import java.awt.Polygon;

public class Circle extends Canvas
{
    public void paint( Graphics g )
    {
        Polygon tri = new Polygon();
        int x=50;
        int y=100;
        g.fillRect(x,y,50,100);
        g.setColor( new Color(134,83,0) );  // defines a brownish color
        g.fillRect(x+17,y+100,16,25);
        tri.addPoint(x+25, y); 
        tri.addPoint(x+50, y+75);
        tri.addPoint(x, y+75);
        g.setColor( Color.GREEN);
        g.fillPolygon(tri);

    }

    public static void main( String[] args )
    {
        JFrame win = new JFrame("Circle");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Circle canvas = new Circle();
        win.add( canvas );
        win.setVisible(true);
    }
}