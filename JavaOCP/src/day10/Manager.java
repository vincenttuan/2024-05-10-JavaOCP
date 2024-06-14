package day10;

public class Manager extends Employee {
	private int budget;

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
		return "Manager [budget=" + budget + "]";
	}
	
	
}
