package day23;

public class AssertDemo {

	public static void main(String[] args) {
		int x = 10;
		assert x > 20: "發生 assert 錯誤";
		
		System.out.println("程式正常結束");
	}

}
