package day15;

public class CompanyTest {

	public static void main(String[] args) {
		Company company = new Company("Nvidia");
		Company.Department deptSales = company.new Department("Sales");
		Company.Department deptIT = company.new Department("IT");
		
		deptSales.displayDeptInfo();
		deptIT.displayDeptInfo();
		
		company.project();
	}

}
