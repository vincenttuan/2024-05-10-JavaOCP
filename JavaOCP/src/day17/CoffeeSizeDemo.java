package day17;

public class CoffeeSizeDemo {
	public static void main(String[] args) {
		CoffeeSize small = CoffeeSize.SMALL;
		System.out.println(small.getMl());
		
		for(CoffeeSize size : CoffeeSize.values()) {
			System.out.println(size + ":" + size.getMl() + " ml");
		}
		
	}
}
