package corejava.strings;

public class StringPoolExample{
   public static void main(String[]args){
   
      String str1="java",str2=new String("java"),str3="java",str4="Hello Java",str5=str4.substring(6,10);
   
      System.out.println(str1+"=="+str2+" :"+(str1==str2));
      System.out.println(str1+"=="+str3+" :"+(str1==str3));
      System.out.println(str1+" .equals("+str2+"):"+(str1.equals(str2)));
      System.out.println("1==5 :"+(str1==str5));
      System.out.println("1.equals(2): "+(str1.equals(str2))); }}