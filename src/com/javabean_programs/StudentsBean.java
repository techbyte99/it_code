package com.javabean_programs;

public class StudentsBean {

	public static void main(String[] args) {
		JavaBean_Ques1 student_1 = new JavaBean_Ques1();
		JavaBean_Ques1 student_2 = new JavaBean_Ques1();
		
		student_1.setFirstName("Manoj");
		student_1.setLastName("Kumar");
		
		student_1.setAge(20);
		
		student_1.setRollNumber("16/CS/010");
		
		student_1.setCourseName("B.Sc (H) Computer Science");
		
		student_2.setFirstName("Aza");
		student_2.setLastName("Homelsy");
		
		student_2.setAge(18);
		
		student_2.setRollNumber("16/ENG/010");
		
		student_2.setCourseName("Psychology Honors");
		
		System.out.println("Student Details\n");
		display(student_1);
		display(student_2);
	}

	private static void display(JavaBean_Ques1 student) {
		// TODO Auto-generated method stub
		System.out.println("Name: " + student.getFirstName() + " " + student.getLastName());
		System.out.println("Age: " + student.getAge());
		System.out.println("Roll Number: " + student.getRollNumber());
		System.out.println("Course: " + student.getCourseName() + "\n");
	}

}
