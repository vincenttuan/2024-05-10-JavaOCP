package day13_2;

public class CoffeeShop {

	public static void main(String[] args) {
		Coffee espresso = new Espresso("Espresso", "衣索比亞", 100, 5, "濃黑咖啡");
		Coffee latte = new Latte("Latte", "哥倫比亞", 150.5, 3, "熟順滑口");
		
		Coffee[] coffees = {espresso, latte};
		for(Coffee coffee : coffees) {
			System.out.printf("%s %s %.1f %d %s%n", 
					coffee.getName(), coffee.getOrigin(), coffee.getPrice(),
					coffee.getStrength(), coffee.getDescription());
		}
 
	}

}
