import java.awt.*;
import javax.swing.JFrame;
import java.awt.Polygon;
import java.util.Random;

public class ForestAndTrees extends Canvas
{
	public void paint( Graphics g )
	{
		// draws a few single trees for testing
		drawTree(g,30,550);
		drawTree(g,100,580);
		drawTree(g,640,300);
		drawTree(g,730,370);
		//draws the first forest
		g.drawRect(10,10,500,500);
		drawForest(g,10,10,500,500);

		// draws the second forest
		g.drawRect(550,20,400,250);
		drawForest(g,550,20,400,250);

		// draws the third forest
		g.drawRect(200,530,710,160);
		drawForest(g,200,530,710,160);
		// * write code here to call drawForest() with the same dimensions as the rectangle above
	}
	
	public void drawTree( Graphics g, int x, int y)
	{
		Polygon tri = new Polygon();
		g.setColor( new Color(134,83,0) );	// defines a brownish color
		g.fillRect(x+17,y+75,16,25);
		tri.addPoint(x+25, y); 
		tri.addPoint(x+50, y+75);
		tri.addPoint(x, y+75);
		g.setColor( Color.GREEN);
		g.fillPolygon(tri);
	}

	public void drawForest( Graphics g, int x, int y, int w, int h )
	{
		// creates a box to demonstrate the forest's boundary
		g.setColor(Color.black);
		g.drawRect(x,y,w,h);
		Random r = new Random();

		for(int tree=0; tree<=100; tree++)
		{
			int a=1+ r.nextInt(w-50); 
			int b= 1+ r.nextInt(h-100);
			// * write code here to give 'a' a random value from [0 , w-50],  (assuming your tree is 50px wide)
			// * write code here to give 'b' a random value from [0 , h-100], (assuming your tree is 100px tall)
			
			drawTree(g,x+a,y+b);
		}
	}

	public static void main(String[] args)
	{
		JFrame win = new JFrame("ForestAndTrees");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new ForestAndTrees() );
		win.setVisible(true);
	}

}