package day12;

public class WrapperDemo1 {

	public static void main(String[] args) {
		// 外包類
		int max = Integer.MAX_VALUE; // 取得int的最大值
		System.out.println(max);
		int x = 10;
		int y = 20;
		int z = Integer.max(x, y); // 取得x, y的最大值
		System.out.println(z);
		int sum = Integer.sum(x, y); // 取得x+y的總和
		System.out.println(sum); 
		// 使用外包類來運算(Java 5.0以前)
		Integer a = Integer.valueOf(50); // Integer 物件
		Integer b = Integer.valueOf(60); // Integer 物件
		int c = a.intValue() + b.intValue(); // 計算 a + b
		//      取出a的int值     取出b的int值
		System.out.println(c);
		// 使用外包類來運算(Java 5.0以後)
		Integer d = 50; // auto-boxing 相當於 Integer d = Integer.valueof(50);
		Integer e = 60; // auto-boxing 相當於 Integer e = Integer.valueof(60);
		int f = d + e; // auto-unboxing 相當於 int f = d.intValue() + e.intValue();
		System.out.println(f);
		
	}

}
