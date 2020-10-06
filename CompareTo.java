
public class CompareTo
{
	public static void main( String[] args )
	{
System.out.print("Comparing penis with shuffeling ");
int i = "penis".compareTo("shuffeling"); // esto da negativo... s>p
System.out.println(i);

System.out.print("Comparing \"applebee's\" with \"apple\" produces ");
System.out.println( "applebee's".compareTo("apple") );  //this should be a positive number

System.out.print("Comparing  yonko with neon");
System.out.println( "yonko".compareTo("neon") ); // esto da positivo

System.out.print("Comparing America with Africa "); //esto da negativo
System.out.println( "America".compareTo("Africa") ); 

System.out.print("Comparing Europe with France "); //esto deberia de dar negativo pq F>E
System.out.println( "Europe".compareTo("France") );

System.out.print("Comparing monkeys with uppercase ");
System.out.println( "monkeys".compareTo("uppercase") ); //esto deberia de dar negativo

System.out.print("Comparing clock with zebra ");
System.out.println( "clock".compareTo("zebra") ); //esto deberia de dar negativo

System.out.print("Comparing watch with hero ");
System.out.println( "watch".compareTo("hero") ); //esto deberia de dar positivo

System.out.print("Comparing demons with apple ");  // positivo
System.out.println( "demons".compareTo("apple") );

System.out.print("Comparing zombies with birds ");
System.out.println( "zombies".compareTo("birds") ); // positivo

System.out.print("Comparing drugs with ansu ");
System.out.println( "drugs".compareTo("ansu") );  //positivo

System.out.print("Comparing jesus with jesus ");
System.out.println( "jesus".compareTo("jesus") );

System.out.print("Comparing nathan with nathan ");
System.out.println( "nathan".compareTo("nathan") );

	}
}