package corejava.streams;

//Used to stream Employees and the attributes that describe an Emplyee Object

public class Employee{

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
      return "Employee [id= "+id+", name= "+name+", salary= "+salary+", department= "+department+"]";}}