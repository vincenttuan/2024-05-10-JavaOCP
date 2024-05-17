package day03;

public class ArrayDemo8 {

	public static void main(String[] args) {
		int price = 13; // 飲料價格
		int cash = 100; // 付現 100 元
		int change = cash - price;
		System.out.printf("飲料一瓶 %d 元%n", price);
		System.out.printf("付現金 %d 元%n", cash);
		System.out.printf("找 %d 元%n", change);
		// 試問如何找 ? 50 = ? 10 = ? 5 = ? 1 = ?
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
