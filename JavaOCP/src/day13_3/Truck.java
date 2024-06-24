package day13_3;

public class Truck extends Car {
	
	public Truck() {
		System.out.println("Truck");
	}
	
	@Override
	void move() {
		System.out.println("用輪子走");
	}
	
}
