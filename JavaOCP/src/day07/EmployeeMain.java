package day07;

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
		int sum = emp1.salary + emp2.salary + emp3.salary;
		
		System.out.printf("總薪資: %,d%n", sum);
		
		
	}

}
