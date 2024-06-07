package day09;

import java.util.Arrays;

public class CoffeeMain {
	public static void main(String[] args) {
		Coffee espresso = new Coffee("Espresso", 50, "Italy");
		Coffee latte = new Coffee("Latte", 45, "France");
		Coffee cappuccino = new Coffee("Cappuccino", 55, "Italy");
		Coffee americano = new Coffee("Americano", 30, "USA");
		Coffee mocha = new Coffee("Mocha", 40, "Yemen");
		
		Coffee[] coffees = {espresso, latte, cappuccino, americano, mocha};
		
		// 列出每一個咖啡品項
		//Arrays.stream(coffees).forEach(coffee -> System.out.println(coffee));
		Arrays.stream(coffees).forEach(System.out::println);
	}
}
