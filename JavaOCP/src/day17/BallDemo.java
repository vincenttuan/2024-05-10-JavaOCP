package day17;

public class BallDemo {

	public static void main(String[] args) {
		// 比較 2 個 Ball 物件是否相等 ?
		Ball b1= new Ball("Red", 100);
		Ball b2= new Ball("Red", 100);
		Ball b3 = b2;
		
		System.out.println(b1 == b2); // false
		System.out.println(b2 == b3); // true
		
		System.out.println(b1.equals(b2));
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		
	}

}
