package com.cognixia.jump.enums;

public class StudentInt {
	
	public static final int FRESHMAN = 1;
	public static final int SOPHMORE = 2;
	public static final int JUNIOR = 3;
	public static final int SENIOR = 4;
	public static final int SUPER_SENIOR = 5;

	private String name;
	private int gradeLevel;

	public StudentInt(String name, int gradeLevel) {
		super();
		this.name = name;
		setGradeLevel(gradeLevel);
		
		// int values are set to 0 if not given a value
		// so will check if value is a zero, and if so, set it by default to 
		// 1 for Freshman
		if(this.gradeLevel == 0) {
			setGradeLevel(FRESHMAN);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(int gradeLevel) {
		
		// only set grade level based on range within the final
		// ints used above
		
		if( (gradeLevel >= 1) && (gradeLevel <= 5) ) {
			this.gradeLevel = gradeLevel;
		}
		
	}
	
	public String stringGradeLevel(int level) {
		
		switch (level) {
		case FRESHMAN:
			return "Freshman";
		case SOPHMORE:
			return "Sophmore";
		case JUNIOR:
			return "Junior";
		case SENIOR:
			return "Senior";
		case SUPER_SENIOR:
			return "Super Senior";

		default:
			return "Unknown";
		}
		
	}

	@Override
	public String toString() {
		return "StudentInt [name=" + name + ", gradeLevel=" + stringGradeLevel(gradeLevel) + "]";
	}

}
