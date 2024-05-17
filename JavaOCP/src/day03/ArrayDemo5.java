package day03;

public class ArrayDemo5 {

	public static void main(String[] args) {
		// 飲料,價格,數量
		String[] names = {"可樂", "紅茶", "咖啡"};
		int[] prices   = {25, 15, 45};
		int[] amounts  = {3, 5, 9};
		// 請印出   
		// 結帳明細
		// -------------
		// 可樂 $25 x 3
		// 紅茶 $15 x 5
		// 咖啡 $45 x 9
		// -------------
		
		//System.out.println(names[0] + " $" + prices[0] + " X " + amounts[0]);
		System.out.printf("%s $%d x %d%n", names[0], prices[0], amounts[0]);
		System.out.printf("%s $%d x %d%n", names[1], prices[1], amounts[1]);
		System.out.printf("%s $%d x %d%n", names[2], prices[2], amounts[2]);
		
		System.out.println("------------------------");
		
		for(int i=0;i<names.length;i++) {
			System.out.printf("%s $%d x %d%n", names[i], prices[i], amounts[i]);
		}
	}

}
