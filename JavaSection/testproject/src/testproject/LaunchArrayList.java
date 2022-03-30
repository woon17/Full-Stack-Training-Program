package testproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

class Type {
	String name = "type";

	Type(String name) {
		this.name = name;
	}

	public String toString() {
		return this.name;
	}
}

public class LaunchArrayList {

	public static void tryArrayList() {
		ArrayList aList = new ArrayList();
//		ArrayList<Object> aList = new ArrayList<>();
		// auto boxing occur.
		aList.add(2);// Integer object
		aList.add(2.33f);// Float object
		aList.add("shufa");// String object
		aList.add(true);// Boolean object

		System.out.println(aList);
		Iterator itr = aList.iterator();
		while (itr.hasNext() == true) {
			System.out.println(itr.next());
		}
		System.out.println();
		ListIterator listItr = aList.listIterator(aList.size());
		while (listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		System.out.println();
		for (Object x : aList) {
			System.out.println(x);
		}

		aList.add(1, "index1");
		System.out.println(aList);

		aList.addAll(aList);
		System.out.println(aList);
		aList.add(2, new Type("type"));
		ArrayList aListClone = (ArrayList) aList.clone();
		System.out.println(aListClone);

		System.out.println(aList);
		((Type) aList.get(2)).name = "typeNew";
		System.out.println(aList);
		System.out.println(aListClone);
		aList.addAll(2, aListClone);
		System.out.println(aList);
		((Type) aList.get(4)).name = "typeNew2";
		System.out.println(aList);
		System.out.println(aListClone);
	}

	static void tryLinkedList() {
		LinkedList aList = new LinkedList();
		aList.add(2);// Integer object
		aList.add(2.33f);// Float object
		aList.add("shufa");// String object
		aList.add(true);// Boolean object
		System.out.println(aList);
	}

	static void tryPriorityQueue() {
//		PriorityQueue<Integer> aList = new PriorityQueue<>((a, b)->b-a);
		PriorityQueue aList = new PriorityQueue();
		aList.add(100);
		aList.add(50);
		aList.add(150);
		aList.add(25);
		aList.add(75);
		aList.add(125);
		aList.add(175);
		System.out.println(aList);
		System.out.println();
		Iterator itr = aList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		while (aList.size() > 0) {
			System.out.println(aList.poll());
		}
	}

	public static void tryIterator() {
		ArrayList aList = new ArrayList();
		aList.add(10);
		aList.add(20);
		aList.add(30);
		aList.add(40);
		System.out.println(aList);

//		can traverse forward and backward direction for listIterator
		ListIterator listItr = aList.listIterator();
		listItr.next();
		listItr.add(1000);
		System.out.println(aList);
//		Iterator can only traverse forward location
		Iterator itr = aList.iterator();

		System.out.println(itr.next());

	}

	public static void tryTreeSet() {
		TreeSet ts = new TreeSet();
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		System.out.println(ts);
	}

	public static void tryBinarySearch() {
		ArrayList aList = new ArrayList();
		aList.add(100);
		aList.add(50);
		aList.add(150);
		aList.add(25);
		aList.add(75);
		aList.add(125);
		aList.add(175);

		System.out.println(aList);
		System.out.println(Collections.binarySearch(aList, 50));
	}

	public static int getOnes(int num) {
		String bin = Integer.toBinaryString(num);
		int res = 0;
		for (Character i : bin.toCharArray()) {
			if (i == '1') {
				res++;
			}
		}
		return res;
	}

	public static void swap(ArrayList<Integer> input, int index1, int index2) {
		int temp = input.get(index1);
		input.set(index1, input.get(index2));
		input.set(index2, temp);
	}

	public static boolean checResult(ArrayList<Integer> realResult) {
		ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 2, 8, 3, 10, 7, 11));

		for (int i = 0; i < realResult.size(); i++) {
			if (realResult.get(i) != expected.get(i)) {
				return false;
			}
		}
		return true;
	}

	public static ArrayList<Integer> doBubbleSortRecursive(ArrayList<Integer> input, int endIndex) {

		if (endIndex == 0) {
			return input;
		} else {
			for (int i = 0; i <= endIndex - 1; i++) {
				int iOnes = getOnes(input.get(i));
				int jOnes = getOnes(input.get(i + 1));
				if (iOnes > jOnes) {
					swap(input, i, i + 1);
				}
			}
			doBubbleSortRecursive(input, endIndex - 1);
		}
		return input;
	}

	public static ArrayList<Integer> doBubbleSortIterative(ArrayList<Integer> input) {
		int size = input.size();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size-1; j++) {
				int iOnes = getOnes(input.get(j));
				int jOnes = getOnes(input.get(j+1));
				if(iOnes > jOnes) {
					swap(input, j, j+1);
				}
			}
		}
		return input;
	}

	public static void tryProblem() {
		ArrayList<Integer> input = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 7, 8, 10, 11));

		System.out.println(input);
		int size = input.size();
		for (int i = 0; i < size; i++) {
			System.out.println(input.get(i) + ": " + getOnes(input.get(i)));
		}
// way 1: using nested for loop
//		for(int i = 0; i < size; i++) {
//			for(int j = i; j < size; j++){
//				int iOnes = getOnes(input.get(i));
//				int jOnes = getOnes(input.get(j));
//				if(iOnes > jOnes) {
//					swap(input, i, j);
//				}
//			}
//		}

//	way 2: using recursive bubbleSort tech
//		input = doBubbleSortRecursive(input, input.size() - 1);
// way 3: using iterative bubbleSort tech
		input = doBubbleSortIterative(input);

		System.out.println(input);
		System.out.println(checResult(input));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		tryArrayList();
//		tryLinkedList();
//		tryPriorityQueue();
//		tryIterator();
//		tryTreeSet();
//		tryBinarySearch();
		tryProblem();

	}

}
