package Games;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class TicTacToe1 {
	static ArrayList<Character> cList = new ArrayList<>(9);// only keep max 9 characters

	static {
		System.out.println("static block execution");
		for (int i = 0; i < 9; i++) {
			cList.add(' ');
		}

	}

	public static void displayBoard(char[][] board) {
		for (char row[] : board) {
			for (char ele : row) {
				System.out.print(ele);
			}
			System.out.println();
		}
	}

	public static void insertBoard(char[][] board, int position, String role) {
		char simple = 'X';
		if (role.equals("player")) {
			simple = 'X';
		} else {
			simple = 'O';
		}
		int indexForList = position - 1;

		switch (position) {
		case 1:

			if (cList.get(1 - 1) == ' ') {
				System.out.println("no 1 position is empty");
				board[0][0] = simple;
			}

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
			board[4][0] = simple;
			break;
		case 8:
			board[4][2] = simple;
			break;
		case 9:
			board[4][4] = simple;
			break;
		default:
			System.out.println("Play enter the right postition (1-9)");
		}
	}
}

public class LaunchGamesWIthCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char board[][] = { { ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' },
				{ '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' } };
		TicTacToe1.displayBoard(board);

		Scanner sc = new Scanner(System.in);
		int playerPos = 0;
		while (true) {
			System.out.println("Enter the postition (1-9): ");
			playerPos = sc.nextInt();
			TicTacToe1.insertBoard(board, playerPos, "player");
			TicTacToe1.displayBoard(board);
			System.out.println("---------------");
			Random rand = new Random();
			int cpuPos = rand.nextInt(9) + 1;
			TicTacToe1.insertBoard(board, cpuPos, "cpu");
			TicTacToe1.displayBoard(board);
		}
	}

}
