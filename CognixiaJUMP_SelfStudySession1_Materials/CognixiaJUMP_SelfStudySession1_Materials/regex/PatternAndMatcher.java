package com.cognixia.jump.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher {
	
	public static void main(String[] args) {
		
		// This example is for a regex pattern for a Cognixia email
		// Cognixia emails are formatted: [first name].[last name]@cognixia.com 
		
		// regex pattern
		// we use two slashes, because w/o it, the slash will be used as an escape for the double quotes
		// try writing a string like "\", will get an error, need to use "\\"
		String emailRegex = "[a-zA-Z]+\\.[a-zA-Z]+@cognixia\\.com";
		
		// regex pattern
		Pattern pattern = Pattern.compile(emailRegex);
		
		// string to be tested against regex
		String email = "orquidia.moreno@cognixia.com";
		
		// matcher created with pattern and string
		Matcher matcher = pattern.matcher(email);
		
		// if-else to check if string matches regex
		if(matcher.matches()) {
			System.out.println("Email matches");
		}
		else {
			System.out.println("Email doesn't match");
		}
		
		// prints the regex pattern used
		System.out.println(matcher.pattern());
		
	
		
	}

}
