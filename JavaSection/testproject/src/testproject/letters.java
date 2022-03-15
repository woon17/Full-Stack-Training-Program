package testproject;

public class letters {

	public static void printA() {
		System.out.println("-------------------");
		for(int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				if(!(i == 0 && j == 0) && !(i == 0 && j == 4) && (i == 0 || i == 5 || j == 0 || j == 4)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printB() {
		System.out.println("-------------------");
		for(int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				if(!(i == 0 && j == 4) && !(i == 5 && j == 4) && !(i == 9 && j == 4)  && (i == 0 || i == 5 || i == 9 || j == 0 || j == 4)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printC() {
		System.out.println("-------------------");
		for(int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				if(!(i == 0 && j == 0) && !(i == 9 && j == 0) && (i == 0 || i == 9 || j == 0 )) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printD() {
		System.out.println("-------------------");
		for(int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				if(!(i == 0 && j == 4) && !(i == 9 && j == 4) && (i == 0 || i == 9 || j == 0 || j == 4)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printE() {
		System.out.println("-------------------");
		for(int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				if(i == 0 || i == 5 || i == 9 || j == 0) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void printF() {
		System.out.println("-------------------");
		for(int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				if(i == 0 || i == 5 || j == 0) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printG() {
		System.out.println("-------------------");
		for(int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				if(!(j == 0 && i == 0) && !(j == 0 && i == 8) && (i == 0 || i == 6 || i == 8 || (j == 0 && i != 9) || (i == 7 && j == 4) || (i == 9 && j == 4))) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printH() {
		System.out.println("-------------------");
		for(int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				if(i == 5 || j == 0 || j == 4) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printI() {
		System.out.println("-------------------");
		for(int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				if(j == 2 || ((i == 0 || i == 9) && j == 1) || ((i == 0|| i == 9) && j == 3)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printA();
		printB();
		printC();
		printE();
		printF();
		printG();
		printH();
		printI();
	}

}
