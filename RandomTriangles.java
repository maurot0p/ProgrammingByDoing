import java.awt.*;
import javax.swing.JFrame;
import java.awt.Polygon;
import java.util.Random;

public class RandomTriangles extends Canvas
{
	public void paint( Graphics g )
	{
		Random r = new Random();
		Polygon tri = new Polygon();
		for(int tria=0; tria<=500; tria=tria+1 )
		{
		
		int x1 = 1 + r.nextInt(1000);
		int y1 = 1 + r.nextInt(768);
		int x2 = 1 + r.nextInt(1000);
		int y2 = 1 + r.nextInt(768);
		int x3 = 1 + r.nextInt(1000);
		int y3 = 1 + r.nextInt(768);
		int r1= r.nextInt(255);
		int g1= r.nextInt(255);
		int b1= r.nextInt(255);
		tri.addPoint(x1, y1); 
		tri.addPoint(x2, y2);
		tri.addPoint(x3, y3);
		Color randColor = new Color(r1,g1,b1); 
		g.setColor(randColor);
		g.fillPolygon(tri);

		}
	
	}
	
	public static void main(String[] args)
	{
		JFrame win = new JFrame("RandomTriangles");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add(new RandomTriangles());
		win.setVisible(true);
	}

}