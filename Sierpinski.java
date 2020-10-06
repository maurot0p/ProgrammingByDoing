import java.awt.*;
import javax.swing.JFrame;
import java.awt.Polygon;
import java.util.Random;

public class Sierpinski extends Canvas
{
	public void paint( Graphics g )
	{
		Random r = new Random();
		Polygon tri = new Polygon();
		int x1 = 512;
		int y1 = 109;
		int x2 = 146;
		int y2 = 654;
		int x3 = 876;
		int y3 = 654;
		int x  = 512;
		int y  =382;
		for(int tria=0; tria<=50000; tria++ )
		{
		g.drawLine(x,y,x,y);
		int random=1+ r.nextInt(3);
			if( random== 1){
				int dx= x-x1;
				int dy= y-y1;
				x = x - dx/2;
				y = y - dy/2;
			}
			else if( random==2){
				int dx= x-x2;
				int dy= y -y2;
				 x = x - dx/2;
				 y = y - dy/2;
			}
			else if( random==3){
				int dx= x-x3;
				int dy= y -y3;
				x = x - dx/2;
				y = y - dy/2;
			}
		}
		g.drawString("Sierpinski Triangle.", 462, 484);
	
	}
	
	public static void main(String[] args)
	{
		JFrame win = new JFrame("Sierpinski");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add(new Sierpinski());
		win.setVisible(true); 
	}

}