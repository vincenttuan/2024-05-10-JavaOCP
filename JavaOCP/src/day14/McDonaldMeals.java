package day14;

public class McDonaldMeals {
	public static void main(String[] args) {
		Burger bigMac = new Burger("大麥克", 78);
		Burger fish = new Burger("麥香魚", 45);
		Burger buger = new Burger("小漢堡", 30);
		
		SideMeal fries = new SideMeal("大薯", 60, 3);
		SideMeal salad = new SideMeal("沙拉", 50, 2);
		SideMeal onion = new SideMeal("洋蔥圈", 40, 1);
		
		Beverage cola = new Beverage("可樂", 20, false);
		Beverage blackTea = new Beverage("冰紅茶", 15, false);
		Beverage coffee = new Beverage("熱咖啡", 40, true);
		
		// 組合餐
		Combo classiCombo1 = new ClassicCombo(buger, fries, coffee);
		Combo classiCombo2 = new ClassicCombo(fish, salad, blackTea);
		Combo discountCombo = new DiscountCombo(buger, onion, coffee, 0.8);
		
		
		
	}
}
