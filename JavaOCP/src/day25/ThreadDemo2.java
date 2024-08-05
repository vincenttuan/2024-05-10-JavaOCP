package day25;

public class ThreadDemo2 {
	public static void main(String[] args) {
		
		Runnable game = () -> {
			for(int i=1;i<=100;i++) {
				System.out.println("game " + i);
			}
			System.out.println("Game Over!");
		};
		Runnable music = () -> {
			for(int i=1;i<=1000;i++) {
				System.out.println("music " + i);
			}
		};
		
		Thread t1 = new Thread(game);
		Thread t2 = new Thread(music);
		t2.setDaemon(true); // 設定為背景執行緒
		
		t1.start();
		t2.start();
		
	}
}
