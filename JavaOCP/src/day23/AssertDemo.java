package day23;

public class AssertDemo {

	public static void main(String[] args) {
		int x = 10;
		// x == 0 不滿足就會發生 assert
		assert x == 0: "發生 assert 錯誤";
		
		System.out.println("程式正常結束");
	}

}
