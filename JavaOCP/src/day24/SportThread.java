package day24;

public class SportThread {
	
	// 跑馬拉松
	public void marathon() {
		String tName = Thread.currentThread().getName();
		for(int i=1;i<=1000;i++) {
			System.out.printf("%s 跑 %d 公里%n", tName, i);
		}
	}
	
}
