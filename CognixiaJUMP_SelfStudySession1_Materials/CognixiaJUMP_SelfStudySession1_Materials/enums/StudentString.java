package com.cognixia.jump.enums;

public class StudentString {
	
	public static final String FRESHMAN = "FRESHMAN";
	public static final String SOPHMORE = "SOPHMORE";
	public static final String JUNIOR = "JUNIOR";
	public static final String SENIOR = "SENIOR";
	public static final String SUPER_SENIOR = "SUPER SENIOR";

	private String name;
	private String gradeLevel;

	public StudentString(String name, String gradeLevel) {
		super();
		this.name = name;
		setGradeLevel(gradeLevel); // need to make sure at initialization value is properly set
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(String gradeLevel) {
		
		// format string so it matches the uppercase format
		// will not match if letters are lowercase
		String gl = gradeLevel.toUpperCase();
		
		// will only change value to one of the final strings
		// listed in the file using this switch case statement
		switch (gl) {
		case FRESHMAN:
		case SOPHMORE:
		case JUNIOR:
		case SENIOR:
		case SUPER_SENIOR:
			
			this.gradeLevel = gl;
			break;

		}
		
		// if string is still null after trying to change value, it's being set by
		// the constructor, just give a default value of freshman so string doesn't stay null
		if(this.gradeLevel == null) {
			this.gradeLevel = FRESHMAN;
		}
		
	}

	@Override
	public String toString() {
		return "StudentInt [name=" + name + ", gradeLevel=" + gradeLevel + "]";
	}

}
