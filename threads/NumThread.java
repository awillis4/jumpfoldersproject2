package corejava.threads;

public class NumThread extends Thread{

   public void run(){System.out.println("Start Thread "+Thread.currentThread().getId());Numbers.print(100);super.run();}}
