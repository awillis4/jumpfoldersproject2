package corejava.strings;

public class StringsRunner{

   public static void newStrings(){//ways to create and edit strings
      String myStr="Hello World";String newStr=new String("Hello World");System.out.println(myStr+", "+newStr);
      String str1="Hello";str1.concat("World");System.out.println(str1);
      String str2=str1.concat("World");System.out.println(str2);
      String str3=str1+2.3+true+'c'+null;System.out.println(str3);}

   public static void comparingStrings(){
      String str1="Hello";String str2=new String("Hello");String str3="Hello";//string pool, heap, string pool
      if(str1==str2){System.out.println("str1 = str2 using == to compare");}
      else{
         System.out.println("str1 /= str2 using ==");}
      if(str1==str3){System.out.println("str1 = str3 using == to compare");}
      else{
         System.out.println("str1 /= str3 using ==");}
      if(str1.equals(str2)){System.out.println("str1 = str2 using equals() to compare");}
      else{
         System.out.println("str1 /= str2 using equals()");}     
      if(str1.equals(str3)){System.out.println("str1 = str3 using equals() to compare");}
      else{
         System.out.println("str1 /= str3 using equals()");} }
                                                    
   public static void stringMethods(){
      String myStr="Hello World";
      System.out.println("The length of the string is: "+myStr.length());
      System.out.println("The fourth character is: "+myStr.charAt(3));
      System.out.println("The index of 'e' is: "+myStr.indexOf('e'));
      System.out.println("The first index of 1 is: "+myStr.indexOf('1'));
      System.out.println("The string after the 3rd index is: "+myStr.substring(3));//substring is an overloaded method
      System.out.println("The strings after index 3 are: "+myStr.substring(3,7));
   
      myStr=" ";System.out.println("string is empty: "+myStr.isEmpty());
      //myStr=" ";System.out.println("string is blank: "+myStr.isBlank());
      myStr="Hello There";System.out.println(myStr.trim());//returns new string with no white space.
   
   //lexigraphic comparation
      System.out.println("a compared to b: "+"a".compareTo("b"));
      System.out.println("b compared to a: "+"b".compareTo("a"));
      System.out.println("a compared to a: "+"a".compareTo("a"));
      System.out.println("b compared to b: "+"b".compareTo("b")); }

   public static void main(String[]args){
   //newStrings();
   //comparingStrings();
   //stringMethods();
   }}