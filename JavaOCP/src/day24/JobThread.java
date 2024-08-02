package day24;

public class JobThread {
	
	// 執行的工作
	public void job() {
		String tName = Thread.currentThread().getName();
		for(int i=1;i<=1000;i++) {
			System.out.printf("%s 跑第 %d 步%n", tName, i);
		}
	}
	
}
