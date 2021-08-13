package corejava.threads;

public class NumbersRunRunner{
   public static void main(String[]args){
   
      System.out.println("Main Thread ID: "+Thread.currentThread().getId());
      for(int i=0;i<3;i++){new Thread(new NumbersRun()).start();}}}