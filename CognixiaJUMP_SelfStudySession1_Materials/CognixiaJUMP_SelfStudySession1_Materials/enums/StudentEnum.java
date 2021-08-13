package com.cognixia.jump.enums;

public class StudentEnum {
	
	public static enum GradeLevel {
		FRESHMAN, SOPHMORE, JUNIOR, SENIOR, SUPER_SENIOR
	}

	private String name;
	private GradeLevel gradeLevel;

	public StudentEnum(String name, GradeLevel gradeLevel) {
		super();
		this.name = name;
		this.gradeLevel = gradeLevel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GradeLevel getGradeLevel() {
		return gradeLevel;
	}

	// don't have to worry about how grade level is set,
	// can only be assigned one of the values listed in the enum declaration
	
	public void setGradeLevel(GradeLevel gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	@Override
	public String toString() {
		return "StudentInt [name=" + name + ", gradeLevel=" + gradeLevel + "]";
	}


}
