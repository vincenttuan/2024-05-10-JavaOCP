package day12;

public class BallTest {

	public static void main(String[] args) {
		// 物件相等測試
		Ball b1 = new Ball("Red", 10);
		Ball b2 = new Ball("Red", 10);
		System.out.println(b1);
		System.out.println(b2);
		
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
		System.out.println(b1.hashCode());
	}

}
