package com.cognixia.jump.regex;

public class StringRegex {
	
	public static void main(String[] args) {
		
		// string text
		String original = "abbacaenibib";

		// no need for Pattern and Matcher
		// just use matches() method
		if(original.matches(".*ba*b.*")) { // ba*b won't work, matches for whole string
			System.out.println("String matches regex = .*ba*b.*");
		}
		else {
			System.out.println("String doesn't match regex");
		}
		
		
		// replace parts of original string using regex and returns new string
		String modified = original.replaceAll("[aeiou]", "@");
		
		System.out.println("\nModified: " + modified);
		
	}

}
