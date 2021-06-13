package com.bridgeLabz.algorithmPrograms;

import java.util.*;

public class BinarySearch {
	public static boolean binarySearch(String words[], String search) {
		Arrays.sort(words);
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(search))
				return true;
		}
		return false;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list of strings seperated with commas");
		String words[] = sc.next().split(",");
		System.out.println("Enter the word you want to search");
		String search = sc.next();
		boolean result = binarySearch(words, search);
		System.out.println(result ? "word is found" : "word is not found");

	}
}
