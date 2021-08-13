package corejava.regex;
import java.util.regex.Matcher;import java.util.regex.Pattern;

public class PatternAndMatcher{
   public static void main(String[]args){
   
      String emailRegex="[a-zA-Z]+\\.[a-zA-Z]+@cognixia\\.com";
      Pattern pat=Pattern.compile(emailRegex);
      String email="orquidia.moreno@cognixia.com";
      Matcher mat=pat.matcher(email);
   
      if(mat.matches()){System.out.println("Email matches");}
      else{System.out.println("Email doesnt match");}
      System.out.println(mat.pattern());}}