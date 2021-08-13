package corejava.threads;

public class NumbersRun implements Runnable{

   @Override public void run(){System.out.println("Start Thread "+Thread.currentThread().getId());Numbers.print(100);}}