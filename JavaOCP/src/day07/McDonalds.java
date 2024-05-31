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
		
		
		
	}
}
