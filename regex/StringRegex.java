package corejava.regex;

public class StringRegex{
   public static void main(String[]args){
   
      String original="abbacaenibib";
      if(original.matches(".*ba*b.*")){System.out.println("String matches regex");}
      else{
         System.out.println("String doesnt match regex");}
                                 
   //replaces parts of original string using regex and returns new string.
      String modified=original.replaceAll("[aeiou]","@");System.out.println("Modified: "+modified);}}