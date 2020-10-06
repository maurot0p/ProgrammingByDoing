import java.awt.*;
import javax.swing.JFrame;
import java.awt.Polygon;

public class BoringTriangle extends Canvas
{
	public void paint( Graphics g )
	{
		g.setColor(Color.black);
		g.drawString("Hey, a triangle!", 50, 50);
		
		Polygon tri = new Polygon();
		tri.addPoint(100, 100); //esto es un triangulo rectangulo
		tri.addPoint(100, 300);
		tri.addPoint(200, 300);

		Color myPurple = new Color(128,0,128);
		g.setColor(myPurple);
		g.fillPolygon(tri);
		
	
	}
	
	public static void main(String[] args)
	{
		JFrame win = new JFrame("BoringTriangle");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new BoringTriangle() );
		win.setVisible(true);
	}

}