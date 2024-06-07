package day09;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1 = new Employee("John", 45000);
		Employee emp2 = new Employee("Mary", 55000);
		Employee emp3 = new Employee();
		emp3.setName("Rose");
		emp3.setSalary(75000);
		
		System.out.println(emp1); // emp1.toString();
		System.out.println(emp2); // emp2.toString();
		System.out.println(emp3); // emp3.toString();
		
		System.out.println(emp1.getName());
		System.out.println(emp3.getSalary());
	}

}
