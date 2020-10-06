import java.awt.*;
import javax.swing.JFrame;

public class SmilingFace extends Canvas
{
    public void paint( Graphics g )
    {
        g.setColor(Color.yellow);
        g.fillOval(200,200,300,300); // draw a filled-in oval
        g.setColor(Color.blue);
        g.fillOval(385,285,30,30);
        g.fillOval(285,285,30,30);   // para hacer un circulo centrado en X,Y tienes que restarle a la cordenada que restarle la mitad del diametro(el radio)
        g.setColor(Color.red);
        g.fillArc(250,400,200,40,0,-180); // draw an arc that starts at 0 degrees
                                         //   and has an arclength of 270 degrees





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
        JFrame win = new JFrame("SmilingFace");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SmilingFace canvas = new SmilingFace();
        win.add( canvas );
        win.setVisible(true);
    }
}