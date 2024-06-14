package day10;

public class Manager extends Employee {
	private int budget;

	public Manager() {
		
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
