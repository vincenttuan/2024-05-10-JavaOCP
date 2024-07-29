package day23;

public class CallStack2 {

	public static void main(String[] args) {
		bar();
	}
	
	public static void bar() {
		foo();
	}
	
	public static void foo() {
		try {
			String s = null;
			System.out.println(s.length());
			System.out.println(10/0);
		} catch (ArithmeticException | NullPointerException e) { // | 中的例外不可以有繼承關係 
			System.out.println(e);
			System.out.println("處理方式是...A");
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("處理方式是...B");
		}
	}

}
