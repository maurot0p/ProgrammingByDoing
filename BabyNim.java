import java.util.Scanner;

public class BabyNim
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		   
      int pile_a, pile_b, pile_c, pile_removen;
      pile_a=5;
      pile_b=5;
      pile_c=5;
      String pile_chosen;
      while((pile_a>0) || (pile_b>0) || (pile_c>0))
      {
      System.out.println("Pile A:" +pile_a + "\t"+ "Pile B:"+pile_b +"\t"+ "Pile C:"+pile_c);
      System.out.print("Choose a pile: ");
      pile_chosen= keyboard.next();
        if(pile_chosen.equalsIgnoreCase("A"))
          {
             System.out.print("how many to remove from pile A: ");
             pile_removen= keyboard.nextInt();
              pile_a=pile_a-(pile_removen);  
          }
        if(pile_chosen.equalsIgnoreCase("B"))
          {
             System.out.print("how many to remove from pile B: ");
             pile_removen= keyboard.nextInt();
              pile_b=pile_b-(pile_removen);  
          }
          if(pile_chosen.equalsIgnoreCase("C"))
          {
             System.out.print("how many to remove from pile C: ");
             pile_removen= keyboard.nextInt();
              pile_c=pile_c-(pile_removen);  
          }
      }
        System.out.println("Congratulations, you've emptied all the piles.");
   }
}