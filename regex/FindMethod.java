package corejava.regex;

import java.util.regex.Pattern;import java.util.regex.Matcher;

public class FindMethod{
   public static void main(String[]args){
      String str="bbcababcabbbaaaabac";String regex="ba*b";
   
      Pattern pat=Pattern.compile(regex);Matcher mat=pat.matcher(str);
      System.out.println("Find method: "+mat.find());
      System.out.println("Matches method: "+mat.matches());
      System.out.println("Find at start of index 12: "+mat.find(12));}}