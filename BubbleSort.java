package com.bridgeLabz.algorithmPrograms;

public class BubbleSort {
	void bubbleSorting(int array[]) {

		int size = array.length;
		for (int i = 0; i < size; i++) {
			for (int j = 1; j < size - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	// Prints the array
	static void printArray(int array[]) {

		int size = array.length;
		for (int i = 0; i < size; i++)
			System.out.println(array[i] + " ");
	}

	// Driver the method
	public static void main(String[] args) {

		BubbleSort bubble = new BubbleSort();
		int array[] = { 45, 67, 34, 23, 98, 56, 85 };
		bubble.bubbleSorting(array);
		System.out.println("Sorted Array using Bubble Sorting: ");
		printArray(array);
	}
}
