package day15;

public abstract class Title {
	
	public void display() {
		System.out.println("名片職稱: " + getName());
	}
	
	public abstract String getName();
	
}
