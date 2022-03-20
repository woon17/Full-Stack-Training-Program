package Games;

import java.util.Random;
import java.util.Scanner;

/*
 * 1: board[0][0]
 * 2: board[0][2]
 * 3: board[0][4]
 * 4: board[2][0]
 * 5: board[2][2]
 * 6: board[2][4]
 * 7: board[4][0]
 * 8: board[4][2]
 * 9: board[4][4]
 * **/
class TicTacToe {
	static int emptyPositions = 9;
	static String winner = "";

	public static void displayBoard(char[][] board) {
		for (char row[] : board) {
			for (char ele : row) {
				System.out.print(ele);
			}
			System.out.println();
		}
	}

	private static Boolean isEmpty(char current) {
		return current == ' ';
	}

	public static boolean insertBoard(char[][] board, int position, String role) {
		char sample = 'X';
		if (role.equals("player")) {
			sample = 'X';
		} else {
			sample = 'O';
		}

		switch (position) {
		case 1:
			if (isEmpty(board[0][0])) {
				board[0][0] = sample;
				emptyPositions--;
				if ((board[0][2] == sample && board[0][4] == sample) || (board[2][0] == sample && board[4][0] == sample)
						|| (board[2][2] == sample && board[4][4] == sample)) {
					winner = role;
				}
				return true;
			}
			return false;

		case 2:
			if (isEmpty(board[0][2])) {
				board[0][2] = sample;
				emptyPositions--;
				if ((board[0][0] == sample && board[0][4] == sample)
						|| (board[2][2] == sample && board[4][2] == sample)) {
					winner = role;
				}
				return true;
			}
			return false;
		case 3:
			if (isEmpty(board[0][4])) {
				board[0][4] = sample;
				emptyPositions--;
				if ((board[0][0] == sample && board[0][2] == sample) || (board[2][4] == sample && board[4][4] == sample)
						|| (board[2][2] == sample && board[4][0] == sample)) {
					winner = role;
				}

				return true;
			}
			return false;
		case 4:
			if (isEmpty(board[2][0])) {
				board[2][0] = sample;
				emptyPositions--;
				if ((board[2][2] == sample && board[2][4] == sample)
						|| (board[0][0] == sample && board[4][0] == sample)) {
					winner = role;
				}
				return true;
			}
			return false;
		case 5:
			if (isEmpty(board[2][2])) {
				board[2][2] = sample;
				emptyPositions--;
				if ((board[2][0] == sample && board[2][4] == sample) || (board[0][2] == sample && board[4][2] == sample)
						|| (board[0][0] == sample && board[4][4] == sample)
						|| (board[0][4] == sample && board[4][0] == sample)) {
					winner = role;
				}
				return true;
			}
			return false;
		case 6:
			if (isEmpty(board[2][4])) {
				board[2][4] = sample;
				emptyPositions--;
				if ((board[2][0] == sample && board[2][2] == sample)
						|| (board[0][4] == sample && board[4][4] == sample)) {
					winner = role;
				}
				return true;
			}
			return false;
		case 7:
			if (isEmpty(board[4][0])) {
				board[4][0] = sample;
				emptyPositions--;
				if ((board[4][2] == sample && board[4][4] == sample) || (board[0][0] == sample && board[2][0] == sample)
						|| (board[0][4] == sample && board[2][2] == sample)) {
					winner = role;
				}
				return true;
			}
			return false;
		case 8:
			if (isEmpty(board[4][2])) {
				board[4][2] = sample;
				emptyPositions--;
				if ((board[4][0] == sample && board[4][4] == sample)
						|| (board[0][2] == sample && board[2][2] == sample)) {
					winner = role;
				}
				return true;
			}
			return false;
		case 9:
			if (isEmpty(board[4][4])) {
				board[4][4] = sample;
				emptyPositions--;
				if ((board[4][0] == sample && board[4][2] == sample) || (board[0][4] == sample && board[2][4] == sample)
						|| (board[0][0] == sample && board[2][2] == sample)) {
					winner = role;
				}
				return true;
			}
			return false;
		default:
			return false;
		}
	}
}

public class LaunchGames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char board[][] = { { ' ', '|', ' ', '|', ' ' }, { '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' },
				{ '-', '+', '-', '+', '-' }, { ' ', '|', ' ', '|', ' ' } };
		// TicTacToe.displayBoard(board);
		Scanner sc = new Scanner(System.in);
		int playerPos = 0;
		while (TicTacToe.emptyPositions > 0 && TicTacToe.winner.length() == 0) {
			System.out.println("Enter the postition (1-9): ");
			playerPos = sc.nextInt();
			if (TicTacToe.insertBoard(board, playerPos, "player")) {
				System.out.println("Player:\n");
				TicTacToe.displayBoard(board);
				System.out.println("---------------");
				System.out.println("CPU:\n");
				while (true) {
					if (TicTacToe.emptyPositions == 0) {
						break;
					}
					Random rand = new Random();
					int cpuPos = rand.nextInt(9) + 1;
					if (TicTacToe.insertBoard(board, cpuPos, "cpu")) {
						break;
					}
				}
				TicTacToe.displayBoard(board);
			}
		}
		if (TicTacToe.winner.length() > 0) {
			System.out.println("Winner: " + TicTacToe.winner);
		} else {
			System.out.println("No Winner");
		}
	}
}
