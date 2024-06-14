package day10;

public class Employee {
	private int salary;
	private String name;
	
	public Employee() {
		
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + "]";
	}
	
	
	
}
