package day13_2;

public class Latte extends AbstractCoffee {

	public Latte(String name, String origin, double price, int strength, String description) {
		super(name, origin, price, strength, description);
	}

	@Override
	public double calculateCaffeine() {
		return getStrength() * 20;
	}

}
