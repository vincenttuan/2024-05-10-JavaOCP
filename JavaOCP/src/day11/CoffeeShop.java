package day11;

public class CoffeeShop {

	public static void main(String[] args) {
		Coffee coffee1 = new Coffee();
		coffee1.makeCoffee();
		
		Coffee coffee2 = new Coffee("拿鐵", '中');
		coffee2.makeCoffee(3);
		
		//--------------------------------------
		IceCreamCoffee iceCreamCoffee1 = new IceCreamCoffee();
		iceCreamCoffee1.makeCoffee();
		
		IceCreamCoffee iceCreamCoffee2 = new IceCreamCoffee("巧克力");
		iceCreamCoffee2.makeCoffee(2);
		
		IceCreamCoffee iceCreamCoffee3 = new IceCreamCoffee("卡布奇諾", '中', "草莓");
		iceCreamCoffee3.makeCoffee(3);
		
	}

}
