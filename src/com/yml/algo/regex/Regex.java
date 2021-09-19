package com.yml.algo.regex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Regex {

	private String name = "<<name>>";
	private String fullName = "<<full name>> ";
	private String mobileNumber = "xxxxxxxxxx";
	private String date = "12/06/2016";

	public void replace() throws IOException {
		try {
			User user = new User();

			File file = new File("/Users/panchamishenoy/Desktop/assignment/Algorithm/src/com/yml/algo/regex/input.txt");
			FileWriter writer = new FileWriter(
					"/Users/panchamishenoy/Desktop/assignment/Algorithm/src/com/yml/algo/regex/output.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = " ", oldtext = "";
			while ((line = reader.readLine()) != null) {
				oldtext = oldtext + line + "\n";
				oldtext = oldtext.replaceAll(name, user.getFirstName());
				oldtext = oldtext.replaceAll(fullName, user.getFirstName() + " " + user.getLastName());
				oldtext = oldtext.replaceAll(mobileNumber, user.getMobileNo());
				oldtext = oldtext.replaceAll(date, user.getDate());
			}
			writer.write(oldtext);
			reader.close();
			writer.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Regex regex = new Regex();
		try {
			regex.replace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}