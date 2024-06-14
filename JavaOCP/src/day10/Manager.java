package day10;

public class Manager extends Employee {
	private int budget;
	
	public Manager(String name, int salary, int budget) {
		//super(name, salary); // 調用父建構子
		setName(name); // 調用父的方法
		setSalary(salary); // 調用父的方法
		this.budget = budget;
	}
	
	public Manager() {
		System.out.println("建立 Manager 物件");
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "Manager [name=" + getName() + ", salary=" + getSalary() + ", budget=" + budget + "]";
	}
	
	
}
