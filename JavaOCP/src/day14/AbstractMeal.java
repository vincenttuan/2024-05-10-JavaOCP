package day14;

public class AbstractMeal implements Meal {
 
	private String name;
	 
	private Integer price;
	 
	public String getName() {
		return name;
	}
	 
	public Integer getPrice() {
		return price;
	}
	 
	public void setName(String name) {
		this.name = name;
	}
	 
	public void setPrice(Integer price) {
		this.price = price;
	}
	 
}
 
