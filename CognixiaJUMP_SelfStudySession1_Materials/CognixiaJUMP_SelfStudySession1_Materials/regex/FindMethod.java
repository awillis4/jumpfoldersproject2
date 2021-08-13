package com.cognixia.jump.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMethod {
	
	public static void main(String[] args) {
		
		// the find() method in Matcher class will look for a substring that matches 
		// instead of trying to match for the whole string
		
		String str = "bbcababcabbbaaaabac";
		String regex = "ba*b";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		
		// searches for subsequence
		System.out.println("Find method: " + matcher.find());
		
		// matches regex for entire string
		System.out.println("Matches method: " + matcher.matches());
		
		// Checks for regex at index towards the end of string
		System.out.println("Find at start of index 12: " + matcher.find(12));		
		
	}

}

