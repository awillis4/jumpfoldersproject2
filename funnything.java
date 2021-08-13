import java.util.*;import java.lang.*;import java.io.*;

public class funnything{Scanner scan=new Scanner(System.in);

   public void truncatesimilar(){
   
   //1. If the console is given a string, it will remove any series of same characters. exg: aabbcc=>abc. aabaabb=>abab.
   
      System.out.println("enter the intended string here, then press enter.");String k=scan.nextLine();
   
      String[]c=k.split("");
      for(int i=0;i<c.length;i++){
         if(c[i]==c[i-1]){System.out.println(k.replace(c[i],""));}}
      
   
   }

   public static void main(String[]args){funnything m = new funnything();
   
      m.truncatesimilar();
   
   }}