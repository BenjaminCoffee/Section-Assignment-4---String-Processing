package com.Pannell;

import acm.program.*;

public class DeletingCharacters extends ConsoleProgram {
	public void run() {
		demonstration();
	}

	public void demonstration() {
		String test = "This is a test";
		char t = 't';

		println(removeAllOccurrences(test, t));
	}

	public String removeAllOccurrences(String string, char ch) {
		StringBuilder str = new StringBuilder();

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == ch) {
				str.append(" ");
			} else {
				str.append(string.charAt(i));
			}
		}

		return str.toString();
	}
}