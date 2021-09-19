package com.yml.algo.regex;

import java.util.Scanner;

public class User {
	private String firstName;
	private String lastName;
	private String mobileNo;
	private String date;

	public User() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first name");
		String firstName = scanner.nextLine();
		setFirstName(firstName);

		System.out.println("Enter last name");
		String lastName = scanner.nextLine();
		setLastName(lastName);

		System.out.println("Enter mobile number");
		String mobile = scanner.nextLine();
		setMobileNo(mobile);

		System.out.println("Enter the date");
		String date = scanner.nextLine();
		setDate(date);

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
