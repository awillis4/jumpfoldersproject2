package com.cognixia.jump.enums;

import com.cognixia.jump.enums.StudentEnum.GradeLevel;

enum Color {
	RED, BLUE, GREEN, YELLOW
}

public class EnumsExample {
	
	public static void main(String[] args) {
		
		//runStudentString();
		//runStudentInt();
		runStudentEnum();
		
		//enumMethods();
		
		//enumWithConstructor();
		
	}
	
	public static void runStudentString() {
		
		// Student should get in a grade level of either Freshman, Sophmore, Junior, or Senior
		
		// Set grade level by calling one of the final static values
		StudentString student = new StudentString("Foo Bar", StudentString.FRESHMAN);
		System.out.println("student = " + student);
		
		// Set grade level to a string with upper and lowercase letters
		student.setGradeLevel("SoPhMoRe");
		System.out.println("student = " + student);
		
		// Set grade level to value not in our list of final statics
		student.setGradeLevel("Kindergardener");
		System.out.println("student = " + student);
		
		// Modify code so that you can include a "Super Senior" value
		student.setGradeLevel("Super Senior");
		System.out.println("student = " + student);
		
		
	}

	public static void runStudentInt() {
		
		// Set grade level by calling one of the final static values
		StudentInt student = new StudentInt("Foo Bar", StudentInt.JUNIOR);
		System.out.println("student = " + student);
		
		// Set grade level by giving own int
		student.setGradeLevel(2);
		System.out.println("student = " + student);
		
		// Set grade to a bad value
		student.setGradeLevel(100);
		System.out.println("student = " + student);
		
		// Modify code so that you can include a 5 value that will stand for a Super Senior
		student.setGradeLevel(5);
		System.out.println("student = " + student);
		
	}
	
	public static void runStudentEnum() {
		
		// Set grade level by calling one of the final static values
		StudentEnum student = new StudentEnum("Foo Bar", GradeLevel.JUNIOR);
		System.out.println("student = " + student);
		
		// Set grade level by giving own enum
		// CAN'T DO THIS, CAN ONLY PICK FROM ENUMS VALUES DECLARED
		//student.setGradeLevel(GradeLevel.OTHER);

		// Modify code so that you can include a Super Senior value
		student.setGradeLevel(GradeLevel.SUPER_SENIOR);
		System.out.println("student = " + student);
		
	}

	public static void enumMethods() {
		
		// to access an enum value: [enum name].[enum value]
		Color color = Color.BLUE;
		
		// enums have a toString() method that allows them to be printed
		System.out.println("color = " + color);
		
		// get the numeric representation of an enum
		// enums listed start from a count of zero, so RED = 0, BLUE = 1, GREEN = 2, etc..
		System.out.println("color.ordinal() = " + color.ordinal());
		
		// return enum name as a string
		String colorStr = color.name();
		System.out.println("color.name() = " + colorStr);
		
		// see all available values for an enum use values(), returns array of the enum values
		System.out.println("\nColors: ");
		for(Color c : Color.values()) {
			System.out.println("- " + c);
		}
		
	}

	public static void enumWithConstructor() {
		
		// look at one of the elements, will only print its name
		Element element = Element.Argon;
		System.out.println("element = " + element);
		
		// access other properties
		System.out.println("element.symbol = " + element.symbol);
		System.out.println("element.atomicNumber = " + element.atomicNumber);
		
		// can define other methods within enum and call it
		element.describe();
		
	}
}














