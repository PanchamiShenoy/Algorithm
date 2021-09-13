package com.yml.algo;

import java.util.Scanner;

public class FindYourNumber {
	static int num;
	static Scanner sc = new Scanner(System.in);

	/*
	 * method to take guess number
	 */
	public static void getInput(int N) {
		System.out.println("Enter number between 0 and" + (N - 1));
		num = sc.nextInt();
		find(0, N - 1);
	}

	/**
	 * method to search for the guessed number
	 * 
	 * @param low
	 * @param high
	 */
	private static void find(int low, int high) {
		if (low == high) {
			System.out.println("Your number is " + low);
			return;
		}

		int mid = (low + high) / 2;
		String ch;
		System.out.println("Is your number between " + low + " and " + mid);
		ch = sc.next();
		if (ch.equals("yes")) {
			find(low, mid);
		} else {
			// System.out.println(mid+" "+high);
			find(mid + 1, high);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindYourNumber.getInput(Integer.parseInt(args[0]));
	}

}
