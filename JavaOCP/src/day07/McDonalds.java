package day07;

public class McDonalds {
	public static void main(String[] args) {
		// 準備商品 
		Hamburg fish = new Hamburg();
		fish.name = "麥香魚";
		fish.price = 59;
		
		Hamburg bigMac = new Hamburg();
		bigMac.name = "大麥克";
		bigMac.price = 75;
		
		Hamburg chicken = new Hamburg();
		chicken.name = "麥香雞";
		chicken.price = 49;
		
		Snack fries = new Snack();
		fries.name = "薯條";
		fries.price = 45;
		
		Snack icecream = new Snack();
		icecream.name = "蛋捲冰淇淋";
		icecream.price = 18;
		
		Snack salad = new Snack();
		salad.name = "生菜沙拉";
		salad.price = 50;
		
		Beverage cola = new Beverage();
		cola.name = "可樂";
		cola.size = '中';
		cola.price = 33;
		
		Beverage soup = new Beverage();
		soup.name = "玉米濃湯";
		soup.size = '大';
		soup.price = 50;
		
		Beverage coffee = new Beverage();
		coffee.name = "美式咖啡";
		coffee.size = '小';
		coffee.price = 30;
		
		//--------------------------------------
		// 建立組合餐
		Combo combo1 = new Combo();
		combo1.no = 1;
		combo1.hamburg = bigMac;
		combo1.snack = fries;
		combo1.beverage = cola;
		
		Combo combo2 = new Combo();
		combo2.no = 2;
		combo2.hamburg = fish;
		combo2.snack = salad;
		combo2.beverage = soup;
		
		Combo[] combos = {combo1, combo2};
		// 更換副餐
		combos[0].snack = icecream;
		
		// 將所點的商品名稱與價格印出
		int sum = 0; // 總計
		for(Combo combo : combos) {
			System.out.printf("餐號 %d%n", combo.no);
			System.out.printf("主餐 %s 價格 %d%n", combo.hamburg.name, combo.hamburg.price);
			System.out.printf("副餐 %s 價格 %d%n", combo.snack.name, combo.snack.price);
			System.out.printf("飲品 %s(%c) 價格 %d%n", combo.beverage.name, combo.beverage.size, combo.beverage.price);
			// 小計
			int subTotal = combo.hamburg.price + combo.snack.price + combo.beverage.price;
			System.out.printf("小計 %d%n", subTotal);
			// 總計累加
			sum += subTotal;
			System.out.println("----------------------");
		}
		System.out.printf("總計 %d%n", sum);
		
	}
}
