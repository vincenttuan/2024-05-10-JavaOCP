package day12;

public class WrapperDemo2 {

	public static void main(String[] args) {
		Tea tea = new Tea();
		tea.setName("綠茶");
		Milk milk = new Milk();
		milk.setName("鮮奶");
		
		System.out.println(tea);
		System.out.println(milk);
	}

}
