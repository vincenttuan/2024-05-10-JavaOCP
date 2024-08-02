package day24;

// 運動類
public class SportThread {
	
	// 跑馬拉松(1000m)
	public void marathon() {
		String tName = Thread.currentThread().getName();
		for(int i=1;i<=1000;i++) {
			System.out.printf("%s 跑 %d 公尺%n", tName, i);
		}
	}
	
}
