package day15;

// 外部類別-公司
public class Company {
	private String name; // 物件變數/屬性/欄位
	
	public Company(String name) { // 建構子/構造函數
		this.name = name; // name 區域變數
	}
	
	// 靜態內部類別
	// 可以支援物件成員與靜態成員
	static class CEO {
		private String ceoName;
		CEO(String ceoName) {
			this.ceoName = ceoName;
		}
		void showCEO() {
			System.out.printf("CEO 是 %s%n", ceoName);
		}
		
		static void showCEO2() {
			System.out.printf("CEO 是 John");
		}
		
	}
	
	public void project(int workdays) {
		// 方法內部類別-特別專案
		class SpecialProject {
			void handle() {
				//workdays = 1; // 方法內部類別中不可以變更方法區域變數
				System.out.printf("執行 %s 特別專案需花費 %d 天%n", name, workdays);
			}
		}
		SpecialProject project = new SpecialProject();
		project.handle();
		//...
	}
	
	// 內部類別-部門
	class Department {
		private String deptName;
		
		public Department(String deptName) {
			this.deptName = deptName;
		}
		
		public void displayDeptInfo() {
			System.out.printf("%s %s%n", Company.this.name, this.deptName);
			//System.out.printf("%s %s%n", name, deptName);
		}
		
	}
	
}
