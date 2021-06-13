package com.bridgeLabz.algorithmPrograms;

import java.util.*;

public class StringPermutations {
	public static ArrayList<String> iterativePermutations(String s) {
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add(String.valueOf(s.charAt(0)));
		for (int i = 1; i < s.length(); i++) {
			for (int j = arrList.size() - 1; j >= 0; j--) {
				String str = arrList.remove(j);
				for (int k = 0; k <= str.length(); k++) {
					arrList.add(str.substring(0, k) + s.charAt(i) + str.substring(k));
				}
			}
		}
		// returning permutations
		return arrList;
	}

	public static String swapString(String a, int i, int j) {
		char[] b = a.toCharArray();
		char ch;
		ch = b[i];
		b[i] = b[j];
		b[j] = ch;
		return String.valueOf(b);
	}

	public static ArrayList<String> recursivePermutations(String str, int start, int end) {
		ArrayList<String> arrList = new ArrayList<>();
		if (start == end - 1)
			arrList.add(str);
		else {
			for (int i = start; i < end; i++) {
				// Swapping the string by fixing a character
				str = swapString(str, start, i);
				// Recursively calling function
				arrList.addAll(recursivePermutations(str, start + 1, end));
				// swapping the characters again.
				str = swapString(str, start, i);
			}
		}
		// returning permutations
		return arrList;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		ArrayList<String> iterativeList = new ArrayList<>();
		ArrayList<String> recursiveList = new ArrayList<>();

		iterativeList = iterativePermutations(str);
		recursiveList = recursivePermutations(str, 0, str.length());
		System.out.println("iteration list :" + iterativeList);
		System.out.println("recursion list :" + recursiveList);
		Collections.sort(iterativeList);
		Collections.sort(recursiveList);
		// checking equality
		if (iterativeList.toString().equals(recursiveList.toString())) {
			System.out.println("\nBoth iterations are equal");
		} else {
			System.out.println("\nIterations are not equal");
		}

	}

}
