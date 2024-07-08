package day17;

public enum CoffeeSize {
	SMALL(100), MEDIUM(150), LARGE(200);
	
	private int ml;
	
	CoffeeSize(int ml) { // private CoffeeSize(int ml)
		this.ml = ml;
	}
	
	public int getMl() {
		return ml;
	}

}
