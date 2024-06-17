package day11;

public class CoffeeShop {

	public static void main(String[] args) {
		Coffee coffee1 = new Coffee();
		coffee1.makeCoffee();
		
		Coffee coffee2 = new Coffee("拿鐵", '中');
		coffee2.makeCoffee(3);
		
	}

}
