package com.yml.algo;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
	static String str1, str2;
	static Scanner sc = new Scanner(System.in);

	/**
	 * method to take input string
	 */
	public static void read() {
		System.out.println("Enter str1");
		str1 = sc.next();
		System.out.println("Enter str2");
		str2 = sc.next();

		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		sc.close();

		int l1 = str1.length();
		int l2 = str2.length();

		if (l1 != l2) {
			System.out.println("Not a anagram");
		} else {
			char array1[] = str1.toCharArray();
			char array2[] = str2.toCharArray();

			array1 = sort(array1);
			array2 = sort(array2);

			checkEqual(array1, array2, l1);

		}
	}

	/**
	 * check if two string are equal
	 * @param array1
	 * @param array2
	 * @param l
	 */
	private static void checkEqual(char[] array1, char[] array2, int l) {
		// TODO Auto-generated method stub
		boolean flag=true;
		for (int i = 0; i < l; i++) {
					if(array1[i]!=array2[i])
					{
						flag=false;
						break;
					}
		}
		
		if(flag==true) {
			
			System.out.println("Anagram");
		} else {
			System.out.println("Not a anagram");
		}
	}

	/**
	 * sort the given array
	 * @param arr
	 * @return
	 */
	private static char[] sort(char[] arr) {

		char temp;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;

	}

	public static void main(String args[]) {
		Anagram.read();
	}
}
