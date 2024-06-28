package day14;

// 組合餐
// 使用抽象類的目的是不可以直接 new Combo, 而必須 new Combo 的子類
public abstract class Combo {
	private Burger burger;
	private SideMeal sideMeal;
	private Beverage beverage;
	
	public Combo(Burger burger, SideMeal sideMeal, Beverage beverage) {
		this.burger = burger;
		this.sideMeal = sideMeal;
		this.beverage = beverage;
	}
	
	public Burger getBurger() {
		return burger;
	}
	
	public void setBurger(Burger burger) {
		this.burger = burger;
	}
	
	public SideMeal getSideMeal() {
		return sideMeal;
	}
	
	public void setSideMeal(SideMeal sideMeal) {
		this.sideMeal = sideMeal;
	}
	
	public Beverage getBeverage() {
		return beverage;
	}
	
	public void setBeverage(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public abstract Integer getPrice();
}
