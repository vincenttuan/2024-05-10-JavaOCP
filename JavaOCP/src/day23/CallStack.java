package day23;

public class CallStack {

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
		} catch (NullPointerException e) {
			System.out.println("捕抓到 null 錯誤, " + e.getMessage());
			System.out.println("處理方式是...A");
		} catch (ArithmeticException e) {
			System.out.println("捕抓到數學錯誤, " + e.getMessage());
			System.out.println("處理方式是...B");
		} catch (Exception e) {
			System.out.println("捕捉到其他錯誤, " + e.getMessage());
			System.out.println("處理方式是...C");
		}
	}
}
