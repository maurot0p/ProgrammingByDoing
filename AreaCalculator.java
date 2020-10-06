import java.util.Scanner;

public class AreaCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to my AREA CALCULATOR");
		System.out.println();
		System.out.println("Choose a shape from which you want to calculate the area:");
		System.out.println("1) Triangle");
		System.out.println("2) Rectangle");
		System.out.println("3) Square");
		System.out.println("4) Circle");
		System.out.println("5) Quit");
		int shape = keyboard.nextInt();
		while(shape!=5)
		if(shape==1){
			System.out.print("Base:");
			int base= keyboard.nextInt();
			System.out.print("Height:");
			int height= keyboard.nextInt();
			System.out.println("The area of the triangle is " +area_triangle(base,height));
			System.out.println("Choose a shape from which you want to calculate the area:");
			shape = keyboard.nextInt();
		}
		else if(shape==2){
			System.out.print("Lenght:");
			int lenght= keyboard.nextInt();
			System.out.print("Width:");
			int width= keyboard.nextInt();
			System.out.println("The area of the rectangle is " +area_rectangle(lenght,width));
			System.out.println("Choose a shape from which you want to calculate the area:");
			shape = keyboard.nextInt();
		}
		else if(shape==3){
			System.out.print("Side:");
			int side= keyboard.nextInt();
			System.out.println("The area of the square is " +area_square(side));
			System.out.println("Choose a shape from which you want to calculate the area:");
			shape = keyboard.nextInt();
		}
		else if(shape==4){
			System.out.print("radius:");
			int radius= keyboard.nextInt();
			System.out.println("The area of the circle is " +area_circle(radius));
			System.out.println("Choose a shape from which you want to calculate the area:");
			shape = keyboard.nextInt();
		}
	System.out.println("Fuck off then");
	}
public static double area_circle( int radius )              // returns the area of a circle
{
	double area_circle= (Math.PI)*(radius*radius);
	return area_circle;
}
public static int area_rectangle( int length, int width )   // returns the area of a rectangle
{
	int area_rectangle= length*width;
	return area_rectangle;
}
public static int area_square( int side )                   // returns the area of a square
{
	int area_square= side*side;
	return area_square;
}
public static double area_triangle( int base, int height )  // returns the area of a triangle
{
	int area_triangle= (base*height)/2;
	return area_triangle;
}
}