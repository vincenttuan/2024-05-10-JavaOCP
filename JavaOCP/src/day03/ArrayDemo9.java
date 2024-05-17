package day03;

public class ArrayDemo9 {
	public static void main(String[] args) {
		int cash = 100;
		String[] names = {"養樂多", "金蘋果"};
		int[] prices = {12, 15};
		int[] amounts = {4, 3};
		// 飲料全部買一送一
		// 請問要花多少錢 ? 要找多少錢 ? 如何找 ? (硬幣個數)
		// 計算總花費
		int total = 0;
		for(int i=0;i<names.length;i++) {
			System.out.printf("%s %d %d %n", names[i], prices[i], amounts[i]);
			// 請計算本次消費金額 = ?
			int paidAmount = amounts[i]/2 + amounts[i]%2;
			int subtotal = paidAmount * prices[i];
			System.out.printf("%d %d %n", paidAmount, subtotal);
			// 總花費累計
			total += subtotal; // total = total + subtotal;
		}
		System.out.printf("總花費 %d%n", total);
		// 計算找零
		int change = cash - total;
		System.out.printf("找零金額 %d%n", change);
		// 如何找 ?
		int fifty = change / 50; // 找50元的數量
		change = change % 50;    // 找完50元之後剩餘的錢
		//---------------------------------------
		int ten = change / 10;   // 找10元的數量
		change = change % 10;    // 找完10元之後剩餘的錢
		//---------------------------------------
		int five = change / 5;   // 找5元的數量
		change = change % 5;     // 找完5元之後剩餘的錢
		//---------------------------------------
		//int one = change / 1;    // 找1元的數量
		int one = change;    // 找1元的數量
		System.out.printf("50元 %d 枚%n", fifty);
		System.out.printf("10元 %d 枚%n", ten);
		System.out.printf("5元 %d 枚%n", five);
		System.out.printf("1元 %d 枚%n", one);
 	}
}
