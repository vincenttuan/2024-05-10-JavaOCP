package day15;

// 外部類別-公司
public class Company {
	private String name; // 物件變數/屬性/欄位
	
	public Company(String name) { // 建構子/構造函數
		this.name = name; // name 區域變數
	}
	
	// 列出所有職稱
	public void displayAllTitles() {
		Title t1 = new Title() {
			@Override
			public String getName() {
				return "總經理";
			}
		};
		
		Title t2 = new Title() {
			@Override
			public String getName() {
				return "軟體設計師";
			}
		};
		
		t1.display();
		t2.display();
	}
	
	// 列出所有員工的工作
	public void displayEmployeeJobs() {
		Employee emp1 = new Employee() {
			@Override
			public void innerWork() {
				System.out.println("寫程式");
			}

			@Override
			public void outsideWork() {
				System.out.println("幫別人除錯程式");
			}

			@Override
			public void specialWork() {
				System.out.println("領導新專案");
			}
		};
		
		emp1.innerWork();
		emp1.outsideWork();
		emp1.specialWork();
	}
	
	// 列出所有工讀生的工作
	public void displayAllPartTimeJobs() {
		// 匿名內部類別
		PartTimeWorker ptw1 = new PartTimeWorker() {
			@Override
			public void job() {
				System.out.println("發傳單");
			}
		};
		
		// Lambda: 簡化/除去冗餘程式碼
		PartTimeWorker ptw2 = () -> {
			System.out.println("折紙箱");
		};
		
		PartTimeWorker ptw3 = () -> System.out.println("貼標籤");
		
		ptw1.job();
		ptw2.job();
		ptw3.job();
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
	// 只支援物件成員不支援靜態成員
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
