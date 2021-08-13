package corejava.reflection;

import java.lang.*;//(Class,reflect.Field,reflect.Method,reflect.Modifier)

public class ReflectionRunner{public static void main(String[]args){

Student student=new Student("foobar","foobar@gmail.com",3.52);
try{Class<?>rClass=Class.forName("reflection.Student");
System.out.println("Reflection:Declared Fields");
Field fieldList[]=rClass.getDeclaredFields();
for(int idx=0;id<fieldList.length;idx++){Field f=fieldList[idx];
System.out.println("Declared Field Name: "+f.getName());System.out.println("Data Type: "+f.getType());
int fieldMods=f.getModifiers();System.out.println("Access Modifiers= "+Modifier.toString(fieldMods));
System.out.println("--------");}

System.out.println("Reflection: Declared Methods");Method methodList[]=rClass.getDeclaredMethods();
for(int idx=0;idx<methodList.length;idx++){Method m=methodList[idx];System.out.println("Declared Field Name: "+m.getName());
Class mParams[]=m.getParameterTypes();for(int x=0;x<mParams.length;x++){
System.out.println("Parameter # "+x+" "+mParams[x]);System.out.println("Return Type: "+m.getReturnType());
System.out.println("------------------");}

System.out.println("Reflection:Invoking Methodology");
Class<?>partypes[]=new Class[2];partypes[0]=String.class;partypes[1]=String.class;
Method mtd=rClass.getMethod("sayHello",partypes);
Object argList[]=new Object[2];argList[0]=new String("John/Jane Doe");argList[1]=new String("Tuesday");
Object returnObj=mtd.invoke(student,argList);String returnValue=returnObbj.toString();System.out.println(returnValue);

System.out.println("Reflection:Manipulating Internal Properties");
Field modFieldGPA=rClass.getField("publishedGPA");
System.out.println(student.getName()+" Current GPA is: "+student.getPublishedGPA());modFieldGPA.setDouble(student,4.0);
System.out.println(student.getName()+" Modified GPA through reflection is: "+student.getPublishedGPA());
catch(Throwable e){System.out.println(e);}}}}}