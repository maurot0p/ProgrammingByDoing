import java.awt.*;
import javax.swing.JFrame;

/************************************************************************************
 **                  B O X Y  2 - use function - all boxes same size               **
 ***********************************************************************************/

class Boxy2 extends Canvas
{
	public void paint( Graphics window )
	{
		//                  color    x    y
		drawBox( window, Color.RED, 200, 300 );
		drawBox( window, Color.PINK, 400, 340 );
		drawBox( window, Color.BLACK, 220, 550 );
		drawBox( window, Color.BLUE, 600, 320 );
		drawBox( window, Color.MAGENTA, 210, 340 );
		drawBox( window, Color.ORANGE, 420, 102 );
		drawBox( window, Color.YELLOW, 201, 202 );
		drawBox( window, Color.CYAN, 350, 340 );
		drawBox( window, Color.GREEN, 350, 111 );
		drawBox( window, Color.GRAY, 111, 550 );
		drawBox( window, Color.DARK_GRAY, 200, 340 );

		// draw ten more boxes -- different colors, different places
	}
	
	public void drawBox( Graphics window, Color c, int x, int y )
	{
		// already finished; do not modify
		
		//this code draws a 100x100 box in color c at (x,y)
		window.setColor(c);
		window.fillRect(x,y,100,100);
		// this code "erases" the center of the box by painting over it in white
		window.setColor(Color.WHITE);
		window.fillRect(x+10,y+10,80,80);
	}


	public static void main( String[] args )
	{
		Canvas canvas = new Boxy2();
		JFrame win = new JFrame("Boxy2 - use function - all boxes same size");
		win.setSize(800,600);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas.setBackground(Color.WHITE);
		win.add( canvas );
		win.setVisible(true);
	}
}