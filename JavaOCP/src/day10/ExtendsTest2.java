package day10;

public class ExtendsTest2 {
	public static void main(String[] args) {
		Employee emp = new Employee("John", 45_000);
		System.out.println(emp);
		
		Manager manager = new Manager("Mary", 8_8000, 10_0000);
		System.out.println(manager);
	}
}
