import java.awt.*;
import javax.swing.JFrame;
import java.awt.Polygon;

public class PolygonDemo extends Canvas
{
	public void paint( Graphics g )
	{
		Polygon tri = new Polygon();
		Random r = new Random();
		for(int tria=0; tria==500; tria=tria+1 )
		{
		Polygon tri = new Polygon();
		int x=50;
		int y= 100; 
		g.fillRect(x,y,50,100);
		g.setColor( new Color(134,83,0) );	// defines a brownish color
		g.fillRect(x+17,y+100,16,25);
		tri.addPoint(x+25, y); 
		tri.addPoint(x+50, y+75);
		tri.addPoint(x, y+75);
		g.setColor( Color.GREEN);
		g.fillPolygon(tri);

		}
	}
	
	public static void main(String[] args)
	{
		JFrame win = new JFrame("Polygon Demo");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new PolygonDemo() );
		win.setVisible(true);
	}

}