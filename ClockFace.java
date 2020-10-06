import java.awt.*;
import javax.swing.JFrame;

public class ClockFace extends Canvas
{
    public void paint( Graphics g )
    {
        g.setColor(Color.black);
        g.drawOval(200,200,300,300); // draw a filled-in oval
        g.setFont(new Font("Serif", Font.PLAIN, 18));
        g.drawString("12", 342, 220); //numeros indican la posicion del string,
        g.drawString("9", 202, 353);
        g.drawString("3", 490, 353);
        g.drawString("6", 344, 496);
        g.fillOval(345,345,10,10);
        g.drawLine( 350,350, 202,353 ); 
        g.drawLine( 350,350, 235,340 );



        // labels
        g.setColor(Color.black);
        g.setFont(new Font(null));
for ( int x=0; x<800; x += 50 )
    g.drawString( String.valueOf(x), x, 50 );
for ( int y=100; y<600; y += 50 )
    g.drawString( String.valueOf(y), 28, y );
// lines
g.setColor(Color.lightGray);
for ( int x=0; x<800; x += 50 )
    g.drawLine(x,0,x,599);    // horizontal
for ( int y=0; y<600; y += 50 )
    g.drawLine(0,y,799,y);    // vertical

    }

    public static void main( String[] args )
    {
        JFrame win = new JFrame("ClockFace");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ClockFace canvas = new ClockFace();
        win.add( canvas );
        win.setVisible(true);
    }
}