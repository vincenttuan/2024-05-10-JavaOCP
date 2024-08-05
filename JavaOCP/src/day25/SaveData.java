package day25;

public class SaveData implements Runnable {

	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		System.out.println(tName + " 儲存資料");
	}

}
