package day14;

public class SideMeal extends AbstractMeal {
 
	private Integer size = 1;
	
	public SideMeal(String name, Integer price, Integer size) {
		setName(name);
		setPrice(price);
		setSize(size);
	}
	
	public Integer getSize() {
		return size;
	}
	 
	public void setSize(Integer size) {
		this.size = size;
	}
	 
}
 
