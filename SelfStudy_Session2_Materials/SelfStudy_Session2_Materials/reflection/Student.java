package com.cognixia.jump.reflection;

public class Student {
	
	private static int idCounter = 1;
	
	private int studentId;
	private String name;
	private String email;
	public double publishedGPA;
	
	public Student(String name, String email, double publishedGPA) {
		super();
		this.studentId = idCounter++; 
		this.name = name;
		this.email = email;
		this.publishedGPA= publishedGPA;
	}
	
	public String sayHello(String guestName, String dayOfWeek) {
		return "Hello there, " + guestName + "!! Welcome to our campus, my name is " + this.getName() + " and I will be your student guide this fine " + dayOfWeek + "!";
	}

	public int getStudentId() {
		return studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getPublishedGPA() {
		return publishedGPA;
	}

	public void setPublishedGPA(double publishedGPA) {
		this.publishedGPA = publishedGPA;
	}

}
