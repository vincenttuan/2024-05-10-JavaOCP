package day07;

import java.util.Arrays;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.name = "John";
		emp1.salary = 45000;
		emp1.level = 1;
		
		Employee emp2 = new Employee();
		emp2.name = "Mary";
		emp2.salary = 55000;
		emp2.level = 2;
		
		Employee emp3 = new Employee();
		emp3.name = "Rose";
		emp3.salary = 78000;
		emp3.level = 4;
		
		// 總薪資
		int sum1 = emp1.salary + emp2.salary + emp3.salary;
		System.out.printf("總薪資: %,d%n", sum1);
		
		Employee[] employees = {emp1, emp2, emp3}; // Employee 物件陣列
		
		int sum2 = 0;
		for(int i=0;i<employees.length;i++) {
			sum2 += employees[i].salary;
		}
		System.out.printf("總薪資: %,d%n", sum2);
		
		int sum3 = 0;
		for(Employee emp : employees) {
			sum3 += emp.salary;
		}
		System.out.printf("總薪資: %,d%n", sum3);
		
		int sum4 = Arrays.stream(employees).mapToInt(emp -> emp.salary).sum();
		System.out.printf("總薪資: %,d%n", sum4);
	}

}
