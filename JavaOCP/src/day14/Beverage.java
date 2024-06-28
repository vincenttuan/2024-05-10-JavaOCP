package day14;

public class Beverage extends AbstractMeal {
 
	private Boolean hot = true;
	
	public Beverage(String name, Integer price, Boolean hot) {
		setName(name);
		setPrice(price);
		setHot(hot);
	}
	
	public Boolean isHot() {
		return hot;
	}
	 
	public void setHot(Boolean hot) {
		this.hot = hot;
	}
	 
}
 
