package corejava.reflection;

public class Animal{

   private double weight;private String type;

   Animal(double weight,String type){this.weight=weight;this.type=type;}
   public void move(){System.out.println("That animal moves.");}
   public double getWeight(){
      return weight;}
   public void setWeight(double weight){this.weight=weight;}
   public String getType(){
      return type;}
   public void setTyper(String type){this.type=type;}
   @Override public String toString(){
      return "Animal[weight= "+weight+", type= "+type+" ]";}}