package Games;
import java.util.Random;
import java.util.Scanner;

class TicTacToe1{
	public static void displayBoard(char[][] board) {
		for (char row[]: board) {
			for(char ele: row) {
				System.out.print(ele);
			}
			System.out.println();
		}
	}
	
	public static void insertBoard(char[][] board, int position, String role) {
		char simple = 'X';
		if (role.equals("player")) {
			simple = 'X';
		}else {
			simple = 'O';
		}

		switch (position) {
			case 1:
				board[0][0] = simple;
				break;
			case 2:
				board[0][2] = simple;
				break;
			case 3:
				board[0][4] = simple;
				break;
			case 4:
				board[2][0] = simple;
				break;
			case 5:
				board[2][2] = simple;
				break;
			case 6:
				board[2][4] = simple;
				break;
			case 7:
				board[4][0] =simple;
				break;
			case 8:
				board[4][2] = simple;
				break;
			case 9:
				board[4][4] = simple;
				break;
		}
	}
}

public class LaunchGames1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char board[][] = {{' ', '|', ' ', '|', ' ' }, 
						  {'-', '+', '-', '+', '-' }, 
						  {' ', '|', ' ', '|', ' ' }, 
						  {'-', '+', '-', '+', '-' }, 
						  {' ', '|', ' ', '|', ' ' }};
		TicTacToe.displayBoard(board);

		Scanner sc = new Scanner(System.in);
		int playerPos = 0;
		while(true) {
			System.out.println("Enter the postition (1-9): ");
			playerPos = sc.nextInt();
			TicTacToe.insertBoard(board, playerPos, "player");
			TicTacToe.displayBoard(board);
			System.out.println("---------------");
			Random rand = new Random();
			int cpuPos = rand.nextInt(9) + 1;
			TicTacToe.insertBoard(board, cpuPos, "cpu");
			TicTacToe.displayBoard(board);
		}
	}

}
