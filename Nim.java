import java.util.Scanner;

public class Nim
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		   
      int pile_a, pile_b, pile_c, pile_removen;
      pile_a=5;
      pile_b=4;
      pile_c=3;
      String player_2choice, player_1, player_2, player_1choice;
      System.out.print("Player 1, enter your name: ");
      player_1= keyboard.next();
      System.out.print("Player 2, enter your name: ");
      player_2= keyboard.next();

      while((pile_a>0) || (pile_b>0) || (pile_c>0))
      {
      System.out.println("Pile A: *****");
      System.out.println("Pile B: ****");
      System.out.println("Pile B: ***");
      System.out.print(player_1 + " ,choose a pile: ");
      player_1choice= keyboard.next();
      if(player_1choice.equalsIgnoreCase("A")&&(pile_a<=0)){
      System.out.println("Oops. That pile is empty");
      player_1choice= keyboard.next();}
        if(player_1choice.equalsIgnoreCase("A") && (pile_a>0)) {        
             System.out.print("how many to remove from pile A: ");
             pile_removen= keyboard.nextInt();
              while((pile_removen<=0)||(pile_removen>pile_a)){
                System.out.println("You cant do that. Try again");
                pile_removen= keyboard.nextInt();}
                pile_a=pile_a-(pile_removen);
                System.out.println("Pile A:" +pile_a + "\t"+ "Pile B:"+pile_b +"\t"+ "Pile C:"+pile_c);
          }
      if(player_1choice.equalsIgnoreCase("B")&&(pile_b<=0)){
      System.out.println("Oops. That pile is empty");
      player_1choice= keyboard.next();}
        if(player_1choice.equalsIgnoreCase("B")&&(pile_b>0))

          {
             System.out.print("how many to remove from pile B: ");
              pile_removen= keyboard.nextInt();
               while((pile_removen<=0)||(pile_removen>pile_b)){
                System.out.print("You cant do that. Try again");
              pile_removen= keyboard.nextInt();}
                pile_b=pile_b-(pile_removen);
                System.out.println("Pile A:" +pile_a + "\t"+ "Pile B:"+pile_b +"\t"+ "Pile C:"+pile_c); 
          }
          if(player_1choice.equalsIgnoreCase("C")&&(pile_c<=0)){
      System.out.println("Oops. That pile is empty");
        player_1choice= keyboard.next();}
          if(player_1choice.equalsIgnoreCase("C")&&(pile_c>0))
          {
             System.out.print("how many to remove from pile C: ");
            pile_removen= keyboard.nextInt();
              while((pile_removen<=0)||(pile_removen>pile_c)){
                System.out.print("You cant do that. Try again");
              pile_removen= keyboard.nextInt();}
                pile_c=pile_c-(pile_removen);
                System.out.println("Pile A:" +pile_a + "\t"+ "Pile B:"+pile_b +"\t"+ "Pile C:"+pile_c); 
          }
          if((pile_a<=0)&&(pile_b<=0)&&(pile_c<=0)){
             System.out.println("Congratulations " +player_2+ ", you've won.");  
             break;}
            if( ((pile_a==1)&&(pile_b<=0)&&(pile_c<=0))||((pile_a<=0)&&(pile_b==1)&&(pile_c<=0))||((pile_a<=0)&&(pile_b<=0)&&(pile_c==1))){
             System.out.println("Congratulations " +player_1+ ", you've won. "+player_2+ " has to take the last pile.");  
             break;}
      System.out.println(player_2+ ",now its your turn to choose a pile: ");
      player_2choice= keyboard.next();
      if(player_2choice.equalsIgnoreCase("A")&&(pile_a<=0)){
      System.out.println("Oops. That pile is empty");
      player_2choice= keyboard.next();}
        if(player_2choice.equalsIgnoreCase("A")&&(pile_a>0))
          {
             System.out.print("how many to remove from pile A: ");
              pile_removen= keyboard.nextInt();
              while((pile_removen<=0)||(pile_removen>pile_a)){
                System.out.print("You cant do that. Try again");
                pile_removen= keyboard.nextInt();}
                pile_a=pile_a-(pile_removen); 
          }
          if(player_2choice.equalsIgnoreCase("B")&&(pile_b<=0)){
      System.out.println("Oops. That pile is empty");
      player_2choice= keyboard.next();}
        if(player_2choice.equalsIgnoreCase("B")&&(pile_b>0))
          {
             System.out.print("how many to remove from pile B: ");
             pile_removen= keyboard.nextInt();
              while((pile_removen<=0)||(pile_removen>pile_b)){
                System.out.print("You cant do that. Try again");
                pile_removen= keyboard.nextInt();}
                pile_b=pile_b-(pile_removen); 
          }
          if(player_2choice.equalsIgnoreCase("C")&&(pile_c<=0)){
          System.out.println("Oops. That pile is empty");
          player_2choice= keyboard.next();}
          if(player_2choice.equalsIgnoreCase("C")&&(pile_c>0)){
          
             System.out.print("how many to remove from pile C: ");
             pile_removen= keyboard.nextInt();
              while((pile_removen<=0)||(pile_removen>pile_c)){
                System.out.print("You cant do that. Try again");
              pile_removen= keyboard.nextInt();}
                pile_c=pile_c-(pile_removen);
            if((pile_a<=0)&&(pile_b<=0)&&(pile_c<=0)){
             System.out.println("Congratulations " +player_1+ ", you've won.");  
             break;}
            if( ((pile_a==1)&&(pile_b<=0)&&(pile_c<=0)) || ((pile_a<=0)&&(pile_b==1)&&(pile_c<=0)) || ((pile_a<=0)&&(pile_b<=0)&&(pile_c==1))){
             System.out.println("Congratulations " +player_2+ ", you've won. "+player_1+ " has to take the last pile.");  
             break;}
           }
          }
       }  
     }

      
   
