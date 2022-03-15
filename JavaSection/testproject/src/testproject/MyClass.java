package testproject;
import java.lang.Math;
import java.util.Arrays;
import java.util.Scanner;

public class MyClass {
	public static void try1() {
		int a = 10;
		System.out.println("Hello World! testproject");
		System.out.println(a);
		a = 0b10; // binary: 0 - 2
		System.out.println(a);
		
		int b = 010; // 0-7
		System.out.println(b);
		
		int c = 0x10; // hex: 0 - F
		System.out.println(c);
		int r = a;
	}
	
	public static void try2() {
		int d = 10; 
		int x;
		d++;
		x = d;
		System.out.println("d: " + d + "; x: " + x);
	}
	
	public static void try3() {
		int d = 10; 
		int x;
		++d;
		x = d;
		System.out.println("d: " + d + "; x: " + x);
	}
	
	public static void try4() {
		int d = 10; 
		int x;
		x = d++;
		System.out.println("d: " + d + "; x: " + x);
	}
	
	public static void try5() {
		int d = 10; 
		int x;
		x = ++d;
		System.out.println("d: " + d + "; x: " + x);
	}
	
	public static void try6() {
		int a = 7;
		System.out.println(a++ + a--); // 8 + 7 = 15
		System.out.println(String.format("a: %s", a));
	}
	
	public static void tryDataType() {
		byte a = -128; // -128 to 127
		System.out.println(String.format("a: %s", a));
	}
	
	public static void getRange(int bytes) {
		int bits = bytes * 8;
		System.out.println(String.format("%.0f to %.0f", -Math.pow(2, bits - 1), Math.pow(2, bits - 1)-1));
	}
	
	public static void try7() {
		int a = 10;
		int b = 0;
//		b = ++10;//cannot use number here 
//		b = ++(++a);//cannot use here as (++a) is a number
		System.out.println(String.format("a : %d; b: %d", a, b));
	}
	
	public static void try8() {
		byte b =5;
//		b = b+1;
		System.out.println(b);
	}
	
	public static void try9() {
		char c = 'a';
		++c;
		System.out.println(c);
	}
	
	public static void try10() {
		double c = 12.4;
		c++;
		System.out.println(c);
	}
	
	public static void try11() {
		double c = 12.4;
		c++;
		System.out.println(c);
	}
	
	public static void try12() {
		byte a = 9;
		byte b = 9;
		byte c = (byte)(a+b);
		int d = (int) c;
		System.out.println(c);
		System.out.println(d);
	}
	
	public static void printStars1() {
//		String result = "";
//		for(int i = 0; i < 5; i++) {
//			result += "*"; 
//		}
//		
//		for(int i = 0; i < 4; i++) {
//			System.out.println(result);
//		}
		
		for(int i = 1; i <= 20; i++) {
			if(i%5 == 0) {
				System.out.println("*");
			}else {
				System.out.print("*");
			}
		}
	}
	public static void printStars2() {
		for(int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void printStars3() {
		for(int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void printSpaceStars1() {
		for(int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(" ");
			}
			
			for (int k = 0; k < 5; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void printSpaceStars2() {
		for(int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(" ");
			}
			
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void printSpaceStars3() {
		for(int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			
			for (int k = 1; k <= 2*i -1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public static void printSpaceStars4() {
		for(int i = 5; i >= 1; i--) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			
			for (int k = 1; k <= 2*i -1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public static void printSpaceStars5() {
		for(int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				if(i == 0 || i == 5 || j == 0 || j == 4) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printSpaceStars6() {
		for(int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				if(i == 0 || i == 5 || j == 0 || j == 4) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
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
	
	public static void printLetters() {
		printA();
		printB();
		printC();
		printE();
		printF();
		printG();
		printH();
		printI();
	}
	
//	one dimension and two dimensional array
	public static void practiceArray1() {
//		int[] a =new int[5];
		int a[] = {10, 20, 30, 40, 40};
		for (int i :a) {
			System.out.println(i);
		}
		System.out.println(Arrays.toString(a));
		
		int b[][] = {{1, 2},{2, 3},{3, 4}};
		for (int[] i :b) {
			System.out.println(Arrays.toString(i));
		}
		System.out.println(Arrays.deepToString(b));
	}
	
	public static void practiceArray2() {
		int marks[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks:");
		for (int i =0; i<marks.length; i++) {
			marks[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(marks));
//		
//		int b[][] = {{1, 2},{2, 3},{3, 4}};
//		for (int[] i :b) {
//			System.out.println(Arrays.toString(i));
//		}
//		System.out.println(Arrays.deepToString(b));
//		
//		int c[][][] = {{{1, 2},{2, 3},{3, 4}}, {{5, 6},{7, 8},{9, 10}}, {{11, 12},{13, 14},{15, 16}}};
//		for (int[][] i :c) {
//			System.out.println(Arrays.deepToString(i));
//		}
//		System.out.println(Arrays.deepToString(c));
		
		sc.close();
	}
	
	
	public static void practiceArray3() {
		int marks[][] = new int[2][5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < marks.length; i++) {
			for (int j = 0; j < marks[i].length; j ++) {
				System.out.println(String.format("Enter the marks of class %s student %s:", i, j));
				marks[i][j] = sc.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(marks));
		sc.close();
	}
	
	public static void practiceArray4() {
		int marks[][][] = new int[2][2][3];
		Scanner sc = new Scanner(System.in);
		
		for(int s = 0; s < marks.length; s++) {
			for (int c = 0; c < marks[s].length; c ++) {
				for (int m = 0; m < marks[s][c].length; m ++) {
					System.out.println(String.format("Enter the marks of school %s class %s student %s:", s, c, m));
					marks[s][c][m] = sc.nextInt();
				}
			}
		}
		System.out.println(Arrays.deepToString(marks));
		sc.close();
	}
	
	public static void practiceArray5() {
		int marks[][] = new int[3][];
		marks[0] = new int[4];
		marks[1] = new int[2];
		marks[2] = new int[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < marks.length; i++) {
			for (int j = 0; j < marks[i].length; j ++) {
				System.out.println(String.format("Enter the marks of class %s student %s:", i, j));
				marks[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < marks.length; i++) {
			for (int j = 0; j < marks[i].length; j ++) {
				System.out.println(String.format("the marks of class %s student %s: %s", i, j, marks[i][j]));
			}
		}
		
		System.out.println(Arrays.deepToString(marks));
		sc.close();
	}

	
	public static void practiceArray6() {
		int marks[][][] = new int[2][][];
		// class level
		marks[0] = new int[2][];
		marks[1] = new int[3][];
		
		// student level
		marks[0][0] = new int[2];
		marks[0][1] = new int[3];
		
		marks[1][0] = new int[2];
		marks[1][1] = new int[4];
		marks[1][2] = new int[3];
		Scanner sc = new Scanner(System.in);
		
		for(int s = 0; s < marks.length; s++) {
			for (int c = 0; c < marks[s].length; c ++) {
				for (int m = 0; m < marks[s][c].length; m ++) {
					System.out.println(String.format("Enter the marks of school %s class %s student %s:", s, c, m));
					marks[s][c][m] = sc.nextInt();
				}
			}
		}
		System.out.println(Arrays.deepToString(marks));
		sc.close();
	}
	
	
	public static void problem1() {
		int[] input = {1, 2, 1, 4};
		// int[] input = {1, 2, 1, 2, 4, 3, 4};
		int res = 0;
		for (int i =0; i < input.length; i++) {
			res ^= input[i];
		}
		System.out.println(res);
	}
	
//	public static void problem2() {
//		int[] input = {4,2,1,7};
//		int[] res = new int[input.length];
//		int result = 1;
//		for (int i =0; i < input.length; i++) {
//			result = 1;
//			for(int j = 0; j < input.length; j++) {
//				if(j != i) {
//					result *= input[j];
//				}
//			}
//			res[i] = result;
//		}
//		System.out.println(Arrays.toString(res));
//	}
	
	public static void problem2() {
		int[] input = {4,2,1,7};
		int product = 1;
		for(int i = 0; i < input.length; i++) {
			product *= input[i];
		}
		
		int[] res = new int[input.length];
		for (int i =0; i < input.length; i++) {
			res[i] = product / input[i];
		}
		System.out.println(Arrays.toString(res));
	}
	
    public static void problem3() {
		int[] input = {1,0,2,0,3,4,0,5};
		int[] res = new int[input.length];
		System.out.println(Arrays.toString(res));
		int target = 0;
		for (int i =0; i < input.length; i++) {
			if(input[i] != 0) {
				res[target] = input[i];
                target++;
			}
		}
		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(res));
	}
    
    public static void addElements() {
 		int[] input = new int[]{1,0,2,0,3,4,0,5};
 		System.out.println(Arrays.toString(input));
 	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		operation pre and post
//		tryDataType();
//		getRange(1);//byte
//		getRange(2);//short
//		getRange(4);//int, float
//		getRange(8);//long, double
//		try12();
//		printStars1();
//		printSpaceStars6();
//		try all characters 
//		printLetters();
//		practiceArray6();
		
//		week 1 day 5
//		problem1();
//		week 2 day 1
//		problem2();
//		problem3();
		addElements();
	}

}
