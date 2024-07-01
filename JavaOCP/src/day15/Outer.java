package day15;

// 外部類別
public class Outer {
	int x = 7; // 物件變數
	static int sx = 9; // 類別變數
	// 內部類別
	public class Inner {
		int x = 77; // 物件變數
		//static int sx = 99; // 一般內部類別不可以有類別成員
		public void display() {
			int x = 777; // 方法區域變數
			System.out.println(x); // 777
			System.out.println(this.x); // 77
			System.out.println(Outer.this.x); // 7
			System.out.println(Outer.sx); // 9
		}
	}
	
	// 測試
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.display();
	}
	
}
