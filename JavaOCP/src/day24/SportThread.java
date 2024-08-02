package day24;

// 運動類
public class SportThread extends Thread {
	
	@Override
	public void run() {
		marathon();
	}
	
	// 跑馬拉松(1000m)
	private void marathon() {
		String tName = Thread.currentThread().getName();
		for(int i=1;i<=1000;i++) {
			System.out.printf("%s 跑 %d 公尺%n", tName, i);
		}
	}
	
}
