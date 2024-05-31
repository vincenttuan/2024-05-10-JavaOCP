package day07;

import java.util.Arrays;

public class DrinkMain {

	public static void main(String[] args) {
		Drink drink1 = new Drink();
		drink1.name = "珍奶";
		drink1.amount = 1;
		drink1.price = 70;
		
		Drink drink2 = new Drink();
		drink2.name = "青茶";
		drink2.amount = 10;
		drink2.price = 40;
		
		Drink drink3 = new Drink();
		drink3.name = "紅茶";
		drink3.amount = 20;
		drink3.price = 25;
		
		Drink drink4 = new Drink();
		drink4.name = "熱可可";
		drink4.amount = 15;
		drink4.price = 55;
		
		// drink1~drink4 是飲料訂單
		// 請問總共花費多少 ?
		int sum1 = drink1.amount * drink1.price + 
				   drink2.amount * drink2.price +
				   drink3.amount * drink3.price +
				   drink4.amount * drink4.price;
		
		System.out.printf("總共花費: %,d%n", sum1);
		
		Drink[] drinks = {drink1, drink2, drink3, drink4};
		
		// 利用 for-each
		int sum2 = 0;
		for(Drink drink : drinks) {
			sum2 += drink.amount * drink.price;
		}
		System.out.printf("總共花費: %,d%n", sum2);
		
		// 利用 Java Stream
		int sum3 = Arrays.stream(drinks).mapToInt(drink -> drink.amount * drink.price).sum();
		System.out.printf("總共花費: %,d%n", sum3);
	}

}
