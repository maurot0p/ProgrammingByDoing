import java.util.Scanner;

public class TicTacToe
{

	private static char[][] board = new char[3][3];

	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		char player1 = 'X', player2 = 'O';
		
		System.out.println("WELCOME TO MY TIC TAC TOE GAME!!!");
		System.out.println("PLAYER 1 PLAYS WITH O. WHILE PLAYER 2 PLAYS WITH X ");
		initBoard();
		displayBoard();
		System.out.println("THIS IS THE BOARD. O PLAYER GOES FIRST");
		
		int turns=0;

			while (turns<9) {
				int location_O;
				int location_X;
				{
				System.out.println("O, choose your location (1-9)");
				location_O= keyboard.nextInt();
					if(location_O==1){
						board[0][0]= player1;
						System.out.println(board[0][0]);}
					else if(location_O==2)
						board[0][1]= player1;
					else if(location_O==3)
						board[0][2]=player1;
					else if(location_O==4)
						board[1][0]= player1;
					else if(location_O==5)
						board[1][1]= player1;
					else if(location_O==6)
						board[1][2]= player1;
					else if(location_O==7)
						board[2][0]= player1;
					else if(location_O==8)
						board[2][1]= player1;
					else if(location_O==9){
						board[2][2]= player1;
					}
					initBoard();
					displayBoard();
					turns++;
					
				{
				System.out.println("X, choose your location (1-9)");
				location_X= keyboard.nextInt();
					if(location_X==1)
						board[0][0]= player2;
					else if(location_X==2)
						board[0][1]= player2;
					else if(location_X==3)
						board[0][2]= player2;
					else if(location_X==4)
						board[1][0]= player2;
					else if(location_X==5)
						board[1][1]= player2;
					else if(location_X==6)
						board[1][2]= player2;
					else if(location_X==7)
						board[2][0]= player2;
					else if(location_X==8)
						board[2][1]= player2;
					else if(location_X==9){
						board[2][2]= player2;
					}
					initBoard();
					displayBoard();
					turns++;

				}
				if(turns>=9)
					System.out.println("ITS A TIE!!!");
			}
		}
}
	public static void initBoard()
	{
		// fills up the board with blanks
		for ( int r=0; r<3; r++ )
			for ( int c=0; c<3; c++ )
				board[r][c] = ' ';
	}


	public static void displayBoard()
	{
		System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		System.out.println("     0 1 2 ");
	}


	public static void displayBoard2()
	{
		for ( int r=0; r<3; r++ )
		{
			System.out.print("\t"+r+" ");
			for ( int c=0; c<3; c++ )
			{
				System.out.print( board[r][c] + " " );
			}
			System.out.println();
		}
		System.out.println("\t  0 1 2 ");
	}
}