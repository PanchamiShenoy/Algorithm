package com.yml.algo;

import java.util.Scanner;

public class BubbleSort {
	static Scanner sc = new Scanner(System.in);

	/**
	 * method to read input into the array
	 */
	public static void read() {
		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the  elements of array");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		bubbleSort(array, n);
		System.out.println("after Sorting");
		for (int num : array) {
			System.out.print(num + " ");

		}

	}

	/**
	 * method to sort array using bubble sort
	 * 
	 * @param arr
	 * @param n
	 */
	public static void bubbleSort(int arr[], int n) {
		int temp;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort.read();
	}

}
