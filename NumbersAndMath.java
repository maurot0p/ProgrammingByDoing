public class NumbersAndMath
{
	public static void main( String[] args )
	{
		System.out.println( "I will now count my chickens:" ); //just stating what im going to do

		System.out.println( "Hens " + ( 25 + 30 / 6 ) );  //adding up the total Hens chickens
		System.out.println( "Roosters " + ( 100 - 25 * 3.0 % 4.0 ) );  //ok so basicamente * y % tienen la misma procedencia, por lo que java los sigue de izq a derecha, entonces se hace 25*3=75%4=3 100-3=97

		System.out.println( "Now I will count the eggs:" );

		System.out.println( 3.0 + 2.0 + 1.0 - 5.0 + 4.0 % 2.0 - 1.0 / 4.0 + 6.0); //4%2= 0 1/4= 0.25=0    lo multiplicativo tome importancia, por eso haces 4%2 y 1/4 primero, luego haces las sumas

		System.out.println( "Is it true that 3 + 2 < 5 - 7?" ); //pone la pregunta

		System.out.println( 3 + 2 < 5 - 7 ); //indica que 5 NO es menor que -2, por lo que es falso

		System.out.println( "What is 3 + 2? " + ( 3 + 2 ) ); // hace la pregunta y la responde en la misma linea, el + es como un espacio
		System.out.println( "What is 5 - 7? " + ( 5 - 7 ) ); // lo mismo

		System.out.println( "Oh, that's why it's false." );  //exactamente

		System.out.println( "How about some more." ); //barras

		System.out.println( "Is it greater? " + ( 5 > -2 ) ); 
		System.out.println( "Is it greater or equal? " + ( 5 >= -2 ) ); //no entiedno como esa operacion matematica te la tira como T or F de una ve, sin tene que aplica boolean
		System.out.println( "Is it less or equal? " + ( 5 <= -2 ) );
	}
}