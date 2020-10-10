package com.Pannell;

import acm.program.ConsoleProgram;

public class AddingCommas extends ConsoleProgram {

	public void run() {
		displayingStrings();
	}

	public void displayingStrings() {
		println("Enter a number to format the number with commas added.");

		while (true) {
			print("Enter a number or enter 0 to end the program: ");

			try {
				int input = readInt();
				if (input == 0) {
					exit();
				}
				println(addCommasToNumericString(input));
			} catch (IllegalArgumentException e) {
				println("You entered invalid data");
			}
		}
	}

	public String addCommasToNumericString(int input) {

		return String.format("%,d", input);
	}
}
