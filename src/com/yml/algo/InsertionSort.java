package com.yml.algo;

import java.util.Scanner;

public class InsertionSort {
	static Scanner sc = new Scanner(System.in);

	/**
	 * method to read array elements
	 */
	public static void read() {
		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		String[] array = new String[n];
		System.out.println("Enter the  elements of array");
		for (int i = 0; i < n; i++) {
			array[i] = sc.next();
		}
		insertionSort(array, n);
		System.out.println("After Sorting");
		for (String word : array) {
			System.out.print(word + " ");

		}
	}

	/**
	 * method to perform insertion sort on array
	 * 
	 * @param arr
	 * @param n
	 */
	public static void insertionSort(String[] arr, int n) {

		for (int i = 1; i < n; i++) {
			String item = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j].compareTo(item) > 0) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = item;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertionSort.read();
	}

}
