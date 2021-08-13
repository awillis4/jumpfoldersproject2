package corejava.strings;

public class EditString{
   public static void main(String[]args){
   
      String str="Hello";StringBuffer sbfr=new StringBuffer("Hi");StringBuilder sbldr=new StringBuilder("Hi");
   
   //this reassigns the schedule of the automated garbage collector.
      for(int i=0;i<5;i++){str=str+i;System.out.println(str);}
   
   //this appends without making a new string object each time.
      for(int i=0;i<5;i++){sbfr.append(i);System.out.println(sbfr);}
   
      sbldr.insert(1,"Hello"); //inserts a string at index 1
      sbldr.delete(2,4);       //deletes characters from index 2 to 4
      sbldr.setCharAt(3,'*');  //replaces character at index 3 with *
      sbldr.setLength(3);      //resets length and removes all chars outside set length
      sbldr.setLength(0);      //totally empties the string builder
      System.out.println("|"+sbldr+"|"); //prints the empty string builder.
   
      sbldr.append(3.14); //appends a double to the end of the builder
      sbldr.append(false);//appends a bool to the end of the builder
      sbldr.insert(3,'%');//inserts a % symbol at index 3 of the builder, moves all the subsequent chars over by 1
      sbldr.insert(4,300L);//inserts a 300L at index 3, builder length increases by 1 agen
      System.out.println(sbldr);//prints the resulting stringbuilder.
   
      sbldr.reverse();//reverses the string stored inside it
      System.out.println(sbldr); }}
