package corejava.threads;

public class Numbers{
   public static void print(int max){
   
      for(int i=0;i<max;i++){System.out.println("Thread "+Thread.currentThread().getId()+" :"+i);}}}