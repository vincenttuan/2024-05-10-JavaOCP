package day14;

// 折扣套餐
public class DiscountCombo extends Combo {
	
	private Double discount; // 折扣
	
	public DiscountCombo(Burger burger, SideMeal sideMeal, Beverage beverage) {
		super(burger, sideMeal, beverage);
	}
	
	public Integer getPrice() {
		Double total = (getBeverage().getPrice() + getSideMeal().getPrice() + getBurger().getPrice()) * discount;
		return (int)total.doubleValue();
	}
	
}
