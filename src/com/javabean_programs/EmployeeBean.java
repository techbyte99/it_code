package com.javabean_programs;

public class EmployeeBean {

	public static void main(String[] args) {
		JavaBean_Ques2 employee_1 = new JavaBean_Ques2();
		JavaBean_Ques2 employee_2 = new JavaBean_Ques2();

		employee_1.setEmployeeID(10069089);
		employee_1.setEmployeeName("Ron Weasely");
		employee_1.setEmployeeSalary(100500);
		employee_1.setEmployeeShift("9 AM - 5 PM");
		
		employee_2.setEmployeeID(10069090);
		employee_2.setEmployeeName("Hermonie Weasely");
		employee_2.setEmployeeSalary(200000);
		employee_2.setEmployeeShift("10:30 AM - 5 PM");
		
		System.out.println("Employee Details\n");
		display(employee_1);
		display(employee_2);
		
	}

	private static void display(JavaBean_Ques2 employee) {
		System.out.println("ID: " + employee.getEmployeeID());
		System.out.println("Name: " + employee.getEmployeeName());
		System.out.println("Salary: " + employee.getEmployeeSalary());
		System.out.println("Shift: " + employee.getEmployeeShift() + "\n");
	}

}
