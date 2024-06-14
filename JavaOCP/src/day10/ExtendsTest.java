package day10;

public class ExtendsTest {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("John");
		emp.setSalary(45_000);
		
		Manager manager = new Manager();
		manager.setName("Mary");
		manager.setSalary(8_8000);
		manager.setBudget(10_0000);
		
		Supervisor supervisor = new Supervisor();
		supervisor.setName("Boss");
		supervisor.setSalary(35_0000);
		supervisor.setBudget(500_0000);
		supervisor.setStockOptions(1_0000_0000.0);
		
		System.out.println(emp);
		System.out.println(manager);
		System.out.println(supervisor);
	}

}
