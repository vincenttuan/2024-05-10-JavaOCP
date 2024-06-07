package day09;

// 員工
public class Employee {
	private String name; // 姓名
	private int salary;  // 薪資 
	
	// 建構子
	public Employee() {
		//System.out.println("呼叫  Employee 建構子");
	}
	
	// 建構子
	public Employee(String name, int salary) {
		//System.out.println("呼叫  Employee 建構子");
		this.name = name;
		this.salary = salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	// 將物件的屬性資料輸出
	public String toString() {
		return String.format("name: %s salary: %d", name, salary);
	}
	
	
}
