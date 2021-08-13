    /* Credentials: From A.Willis for Gordon Allen
   Context: Employee management system for adding and moving employees through different departments.
   
   Objectives: must be able to
   import and export txt(,csv,pdf,json)
   transfer employees between departments
   use File io
   use at least 1 java stream
   use of inheritance
   use of a custom exception
   use of a nested class or enum
   
   //Used to stream Employees and the attributes that describe an Emplyee Object */
   
//The Setup
package corejava.streams;
/*import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.lang.Object;*/
import java.io.*;import java.lang.*;import java.util.*;


//The Console
public class FileStreamsTest{
   public static void main(String[]args)throws IOException{
      Scanner scan=new Scanner(System.in);ArrayList<String> fileEntries=new ArrayList<String>();
      
      //The Strings
      //String s=new String();String line=new String();String entry=new String();String a=new String();
      //String head=new String();String par=new String();String put=new String();
      String line=new String();
      
      //The File
      System.out.println("Copy/paste the file name with extension, then press enter");
      String s=scan.nextLine();
      
      //The Streams
      File in=new File(s);
      FileInputStream ins =new FileInputStream(in);
      FileReader fr=new FileReader(in);
      BufferedReader br=new BufferedReader(fr);
      FileWriter fw=new FileWriter(in);
      BufferedWriter out=new BufferedWriter(fw);
   
   //Note to the user
      System.out.println("all files must be in the same folder as this file, all files to be created will be created in this folder.");
      
         
   //The Loop
      System.out.println("press 0 to stop, or press 1 to continue, then press enter.");
      int stop=scan.nextInt();
      try{
         try{
            if(stop==1){
            
            //Reading the file
               
               while((line=br.readLine())!=null){fileEntries.add(line);}
            
            //Propmting for input
               System.out.println("Input the exact string that the line you would like to edit begins with");
               String head=scan.nextLine();
               System.out.println("Now input the exact string of the value in the line that you would like to change.");
               String par=scan.nextLine();
               System.out.println("Now input the exact string that you would like this value to be changed to.");
               String put=scan.nextLine();
            
            //Changing the file
               for(String entry:fileEntries){
                  if(entry.startsWith(head)){
                     if(line.contains(par)){//entry.add(line);
                        line=line.replace(par,put);}}}br.close();ins.close(); //System.out.println(entry);
               
               //Writing to file
               
               for(String a:fileEntries){out.write(a);}out.flush();out.close();scan.close();}
            
            else if(stop==0){out.close();}
            else if(stop!=0 && stop!=1){System.out.println("you did not enter a 1 or 0, system will close.");out.close();}}
         
         //Catching Exceptions
         catch(FileNotFoundException e){System.err.println("FileStreamsTest: "+e);e.printStackTrace();}}
      catch(IOException e){System.err.println("FileStreamsTest: "+e);e.printStackTrace();}}}
     
 /*public class Employee{

   private static int idCounter=1;private int id;private String name;private int salary;
   private String department;

   public Employee(String name,int salary,String department){
      super();this.name=name;this.salary=salary;this.department=department;this.id=idCounter++;}

   public String getName(){
      return name;}
   public void setName(String name){this.name=name;}
   public int getSalary(){
      return salary;}
   public void setSalary(int salary){this.salary=salary;}
   public String getDepartment(){
      return department;}
   public void setDepartment(String department){this.department=department;}
   public int getId(){
      return id;}

   @Override public String toString(){
      return "Employee [id= "+id+", name= "+name+", salary= "+salary+", department= "+department+"]";}}*/
      
      /*
      Interview questions from real interviews session 2.
      
      1. What are threads?
      A Thread is a data storing method that can store similar bits of data more efficiently.
      
      2. What are 2 ways to make a thread in Java?
      public class Main extends Thread {
  public void run() {
    System.out.println("This code is running in a thread");
  }
}

public class Main implements Runnable {
  public void run() {
    System.out.println("This code is running in a thread");
  }
}https://www.w3schools.com/java/java_threads.asp
      
      3. What is multi threading and how is it implemented in Java?
      It is the act of running multiple threads either parallely, or concurrently.
      https://www.educba.com/what-is-multithreading/
      
      4. What does thread safe mean?
      Thread safe means that the only the thread that is currently running can access the data that it is running on.
      There are four ways to achieve Thread Safety in Java. 
      These are: Synchronization, Volatile Keyword, Atomic Variable, Using Final Keyword.
      https://www.geeksforgeeks.org/thread-safety-and-how-to-achieve-it-in-java/
      
      5. What is sync in java?
      Sync is a way to block methods from entering the block until the ones synced to the block exits the block. 
      
      6. What is deadlock in java, and how do you prevent it?
      Deadlock occures when scheduled methods interfere with each other and stop each other from running.
      Ways to avoid are:
      
    Avoid Nested Locks:
    You must avoid giving locks to multiple threads, this is the main reason for a deadlock condition. It normally happens when you give locks to multiple threads.

    Avoid Unnecessary Locks:
    The locks should be given to the important threads. Giving locks to the unnecessary threads that cause the deadlock condition.

    Using Thread Join:
    A deadlock usually happens when one thread is waiting for the other to finish. In this case, we can use Thread.join with a maximum time that a thread will take.
     
    And concurrent synchronization.
     
     https://www.edureka.co/blog/deadlock-in-java/
      
      7. How do u stop a thread excecution in java?
      thread.stop();thread.sleep();thread.interrupt();
      https://www.baeldung.com/java-thread-stop
      
      8. What is the difference between the start() and run() methods that are used by java threads?
      Start() initializes the thread, run() excecutes the thread.
      
      9. What is exception handling and how do you implement it in Java?
      Use exception methods under the throwable class. Usually try catch methods.
      https://www.javatpoint.com/exception-handling-in-java
      
      10. How is an exception checked v unchecked?
      An exception is checked when it is recognized, but not when it is caught. unchecked exceptions are not recognized or caught.
      
      11. Does the finally block always execute after a try catch block?
      No. Finally is used for multiple tries running in parallel.
      
      12. What are streams in java and how do u use them?
      A stream is a collection organized in series.
      They can be called using List<String>s=new List<String>(),Arrays.asList,strings.stream(); and other methods.
      https://www.tutorialspoint.com/java8/java8_streams.htm
      
      13. What are the differences between collection and stream?
      Streams are sorted in series according to input order and the order is memorized. 
      Collections do not respect the input order.
      
      14. What is lambda expression and how is it used in java?
      Lambda expression is a way to streamline syntax without repeating methods that u want to call.
      https://www.javatpoint.com/java-lambda-expressions
      
      15. What is a java functional interface, and how is it used?
      It is an interface that contains only 1 abstract method. It can have methods of the object class and store objects.
      https://www.javatpoint.com/java-8-functional-interfaces
      
      16. What is serialization and how do u achieve this in java?
      Serialization is the process of storing data as bytecode in order to save space.
      1 way it is achieved by saying public class whatever implements java.io.Serializable{}.
      https://www.tutorialspoint.com/java/java_serialization.htm
      
      17. What is the latest version of java that u worked with, and what are its new features?
      The latest version of java that I worked with is java 8, and some of its new features are stream and serialization.
      
      18. What is a singleton design pattern, and how is it implemented in java?
      A singleton is a private method that can only store 1 object. 
      It is called with private Singleton(){}.
      https://www.geeksforgeeks.org/singleton-class-java/
      
      19. What java design patterns are u familiar with and currently working with?
      I am familiar with builder, iterator, abstract, state.
      https://refactoring.guru/design-patterns/java
      
      20. What new features in java 8 have u worked with?
      Serialization, and streaming.
      
      21. What is annotation in java?
      Annotation is metadata that describes data and are not used by the compiler.
      https://www.programiz.com/java-programming/annotations
      
      Choose two resources from the exploratory mindset segment and ask yourself:
      
      22. Which 2 did u choose?
      I chose the case for curiosity and the psychology of success.
      
      23. What did u learn from these 2?
      I learned about some of the reasons behind using certain research methods, and how to trick yourself into doing big things.
      
      24. What do u plan to improve moving forward?
      I plan to improve my knowledge of the different java methods and tactics.
      
      Choose two topics out of anything and explain
      
      25. 3 main points u find intriguing about one of these topics.
      Some intriguing things about plants is that they have cell walls. they dont need hearts, and they can move without brains.
      
      26. 3 main points about 1 of these topics that are new to u.
      Three structures present in plants but not so much in animals are photosystems, magnesium globular systems, and nitrogenic reception.
      
      27. Explain 1 correlation between the 2 topics.
      1 correlation between the 2 topics is that they both emit measurable sounds.
      
      30 day video timeout link:https://streamable.com/9ffe8x
      */