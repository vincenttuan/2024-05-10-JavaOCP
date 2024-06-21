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

	}

}
