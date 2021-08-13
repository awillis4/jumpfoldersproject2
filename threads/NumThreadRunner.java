package corejava.threads;

public class NumThreadRunner{
   public static void main(String[]args){
   
      Numbers.print(100);
      System.out.println("Main Thread ID: "+Thread.currentThread().getId());
      for(int i=0;i<3;i++){new NumThread().start();}}}