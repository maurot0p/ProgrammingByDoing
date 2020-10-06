import java.util.Scanner;

public class DHondt
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

int votos_1, votos_2, votos_3, votos_4, votos_5, votos_6;
String partido_1, partido_2, partido_3, partido_4, partido_5, partido_6;
int escanos=5;

System.out.println("Para la circunscripcion 1 del distrito nacional. Se van a repartir un total de 5 escanos entre 6 partidos.  El proposito del metódo D´ Hondt es repartir los escanos de manera proporcional");
System.out.print("Cual es el primer partido?");
partido_1= keyboard.next();
System.out.print("Cual es el segundo partido?");
partido_2= keyboard.next();
System.out.print("Cual es el tercer partido?");
partido_3= keyboard.next();
System.out.print("Cual es el cuarto partido?");
partido_4= keyboard.next();
System.out.print("Cual es el quinto partido?");
partido_5= keyboard.next();
System.out.print("Cual es el sexto y último partido?");
partido_6= keyboard.next();
System.out.println();
System.out.println("Enumera los votos por partido");
System.out.print("Cuantos votos obtuvo el " +partido_1+ "? ");
votos_1= keyboard.nextInt();
System.out.print("Cuantos votos obtuvo el " +partido_2+ "? ");
votos_2= keyboard.nextInt();
System.out.print("Cuantos votos obtuvo el " +partido_3+ "? ");
votos_3= keyboard.nextInt();
System.out.print("Cuantos votos obtuvo el " +partido_4+ "? ");
votos_4= keyboard.nextInt();
System.out.print("Cuantos votos obtuvo el " +partido_5+ "? ");
votos_5= keyboard.nextInt();
System.out.print("Cuantos votos obtuvo el " +partido_6+ "? ");
votos_6= keyboard.nextInt();

while( escanos!=0)
{
 		if((votos_1 > votos_2) && (votos_1 > votos_3) && (votos_1 > votos_4) && (votos_1 > votos_5) && (votos_1 > votos_6)){
 			System.out.println("El primer escano va para el " +partido_1+ ".");
 			escanos--;
 				if((votos_2 > (votos_1/2)) && (votos_2 > votos_3) && (votos_2 > votos_4) && (votos_2 > votos_5) && (votos_2 > votos_6)){
 				System.out.println("El segundo escano va para el " +partido_2+ ".");
 				escanos--;
 					if(votos)}
 				if((votos_3 > (votos_1/2)) && (votos_3 > votos_2) && (votos_3 > votos_4) && (votos_2 > votos_5) && (votos_2 > votos_6)){
 			System.out.println("El segundo escano va para el " +partido_3+ ".");
 			escanos--;}
 				if((votos_4 > (votos_1/2)) && (votos_4 > votos_3) && (votos_4 > votos_2) && (votos_4 > votos_5) && (votos_4 > votos_6)){
 				System.out.println("El segundo escano va para el " +partido_4+ ".");
 				escanos--;}
 				if((votos_5 > (votos_1/2)) && (votos_5 > votos_2) && (votos_5 > votos_3) && (votos_5 > votos_4) && (votos_5 > votos_6)){
 			System.out.println("El segundo escano va para el " +partido_5+ ".");
 			escanos--;}
 				if((votos_6 > ((votos_1/2)) && (votos_6 > votos_2) && (votos_6 > votos_3) && (votos_6 > votos_4) && (votos_6 > votos_5)){
 			System.out.println("El segundo escano va para el " +partido_6+ ".");
 			escanos--;}
 			if(((votos_1/2) > votos_2) && (((votos_1/2) > votos_3) && ((votos_1/2) > votos_4) && ((votos_1/2) > votos_5) && ((votos_1/2) > votos_6)))
 				System.out.println("El segundo escano va para el " +partido_1+ ".");
 				escanos--; 
 			if(((votos_1/3) > votos_2) && (((votos_1/3) > votos_3) && ((votos_1/3) > votos_4) && ((votos_1/3) > votos_5) && ((votos_1/3) > votos_6)))
 				System.out.println("El tercer escano va para el " +partido_1+ ".");
 				escanos--;
 			if(((votos_1/4) > votos_2) && (((votos_1/4) > votos_3) && ((votos_1/4) > votos_4) && ((votos_1/4) > votos_5) && ((votos_1/4) > votos_6)))
 				System.out.println("El cuarto escano va para el " +partido_1+ ".");
 				escanos--;
 			if(((votos_1/5) > votos_2) && (((votos_1/5) > votos_3) && ((votos_1/5) > votos_4) && ((votos_1/5) > votos_5) && ((votos_1/5) > votos_6))){
 				System.out.println("El quinto y ultimo escano va para el " +partido_1+ ".");
 				escanos--;
 				break;}
 			}



 		if((votos_2 > votos_1) && (votos_2 > votos_3) && (votos_2 > votos_4) && (votos_2 > votos_5) && (votos_2 > votos_6))
 			System.out.println("El primer escano va para el " +partido_2+ ".");
 			escanos--;

 		if((votos_3 > votos_1) && (votos_3 > votos_2) && (votos_3 > votos_4) && (votos_2 > votos_5) && (votos_2 > votos_6))
 			System.out.println("El primer escano va para el " +partido_3+ ".");
 			escanos--;

 		if((votos_4 > votos_1) && (votos_4 > votos_2) && (votos_4 > votos_3) && (votos_4 > votos_5) && (votos_4 > votos_6))
 			System.out.println("El primer escano va para el " +partido_4+ ".");
 			escanos--;
 		if((votos_5 > votos_1) && (votos_5 > votos_2) && (votos_5 > votos_3) && (votos_5 > votos_4) && (votos_5 > votos_6))
 			System.out.println("El primer escano va para el " +partido_5+ ".");
 			escanos--;
 		if((votos_6 > votos_1) && (votos_6 > votos_2) && (votos_6 > votos_3) && (votos_6 > votos_4) && (votos_6 > votos_5))
 			System.out.println("El primer escano va para el " +partido_6+ ".");
 			escanos--;
}
	}
}