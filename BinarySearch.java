package com.bridgeLabz.algorithmPrograms;

import java.util.*;

public class BinarySearch {
	public static int binarySearch(String words[], String search) {
		int lowerBound = 0, upperBound = words.length - 1;
		while (lowerBound <= upperBound) {
			int index = lowerBound + (upperBound - lowerBound) / 2;
			int res = search.compareTo(words[index]);
			// Check if string is present at mid
			if (res == 0)
				return index;
			// If x greater, ignore left half
			if (res > 0)
				lowerBound = index + 1;
			// If x is smaller, ignore right half
			else
				upperBound = index - 1;
		}

		return -1;

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list of strings seperated with commas");
		String words[] = sc.next().split(",");
		System.out.println("Enter the word you want to search");
		String search = sc.next();
		Arrays.sort(words);
		int result = binarySearch(words, search);
		System.out.println((result != -1) ? "word is found" : "word is not found");

	}
}
