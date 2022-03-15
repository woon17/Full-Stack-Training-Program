package MiniProject;
import java.util.Scanner;

class Guesser{
	int gNum;
	int guessNum() {
		System.out.println("Guesser, kindly guess a number: (0-50)");
		Scanner sc = new Scanner(System.in);
		gNum = sc.nextInt();
//		sc.close();
		return gNum;
	}
}

class Player{
	int pNum;
	
	int guessNum() {
		System.out.println("Player, kindly guess a number: (0-50)");
		Scanner sc = new Scanner(System.in);
		pNum = sc.nextInt();
//		sc.close();
		return pNum;
	}
}

class Umpire{
	int numFromGuessser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser() {
		Guesser g = new Guesser();
		numFromGuessser = g.guessNum();
	}
	
	void collectNumFromPlayer() {
		Player p1 = new Player();
		numFromPlayer1 = p1.guessNum();
		
		Player p2 = new Player();
		numFromPlayer2 = p2.guessNum();
		
		Player p3 = new Player();
		numFromPlayer3 = p3.guessNum();
	}
	
	void compare() {
		if(numFromGuessser == numFromPlayer1) {
			System.out.println("Player 1 wins");
			if(numFromPlayer1 == numFromPlayer2) {
				System.out.println("Player 2 wins");
			}
			
			if(numFromPlayer1 == numFromPlayer3) {
				System.out.println("Player 3 wins");
			}
			
		}else if(numFromGuessser == numFromPlayer2) {
			System.out.println("Player 2 wins");
			if(numFromPlayer2 == numFromPlayer3) {
				System.out.println("Player 3 wins");
			}
		}else if(numFromGuessser == numFromPlayer3) {
			System.out.println("Player 3 wins");
		}else {
			System.out.println("Game lost. Try again!");
		}
	}
}

public class LaunchGuesser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire umpire = new Umpire();
		while(true) {
			umpire.collectNumFromGuesser();
			umpire.collectNumFromPlayer();
			umpire.compare();	
		}

	}

}
