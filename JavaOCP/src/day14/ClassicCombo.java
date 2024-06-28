package day14;

// 經典組合餐
public class ClassicCombo extends Combo {

	public ClassicCombo(Burger burger, SideMeal sideMeal, Beverage beverage) {
		super(burger, sideMeal, beverage);
	}
	
	public Integer getPrice() {
		Integer total = getBeverage().getPrice() + getSideMeal().getPrice() + getBurger().getPrice();
		return total;
	}

}
