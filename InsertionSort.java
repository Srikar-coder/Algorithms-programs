package com.bridgeLabz.algorithmPrograms;

import java.util.*;

public class InsertionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of strings");
		int size = sc.nextInt();// taking size of array
		String[] stringArr = new String[size];
		for (int i = 0; i < size; i++) {
			stringArr[i] = sc.next();
		}
		String sortedArray[] = insertionSort(stringArr, size);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
	}

	public static String[] insertionSort(String array[], int size) {
		String temp = "";
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				// comparing strings
				if (array[i].compareToIgnoreCase(array[j]) > 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		// returning sorted string array
		return array;
	}
}
