import java.awt.*;
import javax.swing.JFrame;
import java.awt.Polygon;
import java.util.Random;

public class RandomRightTriangles extends Canvas
{
	public void paint( Graphics g )
	{
		Random r = new Random();
		Polygon tri = new Polygon();
		for(int tria=0; tria<=500; tria++ )
		{
		
		int x1 = 1 + r.nextInt(400);
		int y1 = 1 + r.nextInt(500);
		int x2 = 1 + r.nextInt(400);
		int y2 = y1 +50;
		int x3 = x1+50;
		int y3 = y1 +50;
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
		JFrame win = new JFrame("RandomRightTriangles");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add(new RandomRightTriangles());
		win.setVisible(true); 
	}

}