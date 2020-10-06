import java.awt.*;
import javax.swing.JFrame;
import java.io.File;
import javax.imageio.ImageIO;

public class MotivationalPoster extends Canvas
{
	Image coolFace, vinicius;
	
	public MotivationalPoster() throws Exception
	{
		vinicius = ImageIO.read( new File("vinicius.jpg") );
		// Java supports PNG, JPEG, and GIF (but not animated GIFs). It does not support BMP.
	}
	
	public void paint( Graphics g )
	{
		//           Image  , x,  y, this
		g.drawImage(vinicius,100,100,this);
		// And, just for fun, let's give me a halo! This halo designed by Liz O in 2012.
		g.setFont(new Font("TimesRoman", Font.PLAIN, 40)); 
		g.drawString("Nunca te rindas, se como O rei.", 430, 715); //numeros indican la posicion del string,
		g.setFont(new Font("CenturyGothic", Font.PLAIN, 30)); 
		g.drawString("O rei, Vinicius Jr.", 550, 760); //numeros indican la posicion del string,

		

	}

	public static void main(String[] args) throws Exception
	{
		JFrame win = new JFrame("MotivationalPoster");
		win.setSize(1024,768);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.add( new MotivationalPoster() );
		win.setVisible(true);
	}


}