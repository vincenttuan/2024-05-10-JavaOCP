package day11;

public class IceCreamCoffee extends Coffee {
	private String flavor; // 口味
	
	public IceCreamCoffee() {
		flavor = "香草";
	}
	
	public IceCreamCoffee(String flavor) {
		this.flavor = flavor;
	}
	
	// 複寫方法
	@Override
	public void makeCoffee() {
		System.out.printf("我要 1 杯 %s口味的%c%s冰淇淋咖啡%n", flavor, getSize(), getType());
	}
	
	@Override
	public void makeCoffee(int amount) {
		System.out.printf("我要 %d 杯 %s口味的%c%s冰淇淋咖啡%n", amount, flavor, getSize(), getType());
	}
	
	
}
