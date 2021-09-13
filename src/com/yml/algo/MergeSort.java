package com.yml.algo;

import java.util.Scanner;

public class MergeSort {
	static Scanner sc = new Scanner(System.in);

	/**
	 * to read elements into the array
	 */
	public static void read() {
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		String array[] = new String[n];
		System.out.println("Enter the array");
		for (int i = 0; i < n; i++) {
			array[i] = sc.next();
		}

		mergeSort(array, 0, array.length - 1);
		for (String words : array) {
			System.out.println(words);

		}

	}

	/*
	 * method to sort the array by splitting
	 */
	public static void mergeSort(String[] a, int beg, int end) {
		if (beg == end) {
			return;
		}
		int mid = (beg + end) / 2;

		mergeSort(a, beg, mid);
		mergeSort(a, mid + 1, end);
		merge(a, beg, mid, end);
	}

	/**
	 * method to merge to array thats split
	 * @param a
	 * @param beg
	 * @param mid
	 * @param end
	 */
	public static void merge(String[] a, int beg, int mid, int end) {
		int n = end - beg + 1;
		String[] b = new String[n];
		int i = beg;
		int j = mid + 1;
		int k=0;

		while (i <= mid && j <= end) {
			if (a[i].compareTo(a[j]) < 0) {
				b[k] = a[i];
				i++;
			} else {
				b[k] = a[j];
				j++;
			}
			k++;
		}

		while (i <= mid) {
			b[k] = a[i];
			i++;
			k++;
		}

		while (j <= end) {
			b[k] = a[j];
			j++;
			k++;
		}

		for (j = 0; j < n; j++) {
			a[beg + j] = b[j];
		}
	}

	public static void main(String[] args) {
		MergeSort.read();
	}

}
