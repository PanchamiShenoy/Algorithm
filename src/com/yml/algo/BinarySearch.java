package com.yml.algo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinarySearch {

	static Scanner r = new Scanner(System.in);

	/**
	 * Reads the text file and then stores each word in an array
	 */
	public static void readFile() {

		try {
			Scanner x = new Scanner(
					new File("/Users/panchamishenoy/Desktop/assignment/Algorithm/Data/BinarySearch.txt"));

			String text = "";
			while (x.hasNext()) {
				text = text + x.next() + " ";
			}
			String[] array = text.split(" ");
			System.out.println("Enter the key to search");
			String key = r.nextLine();
			sort(array);
			binarySearch(array, key);

			x.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

	/**
	 * sort the given array in ascending order
	 * 
	 * @param a
	 */
	private static void sort(String[] a) {

		System.out.println("UnSorted array");

		for (String string : a) {
			System.out.println(string);

		}
		int length = a.length;
		String temp;

		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (a[j].compareTo(a[j + 1]) > 0) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}
		}

		System.out.println("Sorted array is ");

		for (String words : a) {
			System.out.println(words);

		}

	}

	/**
	 * method to search key in the array
	 */
	private static void binarySearch(String[] a, String key) {
		int left = 0, right = a.length - 1;
		int mid;
		while (left <= right) {
			mid = (left + right) / 2;

			if (key.compareTo(a[mid]) == 0) {
				System.out.println(key + "is found at position " + (mid + 1));
				System.exit(0);
			}
			if (key.compareTo(a[mid]) > 0) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}
		System.out.println("Not found");

	}

	public static void main(String args[]) {
		BinarySearch.readFile();
	}

}
