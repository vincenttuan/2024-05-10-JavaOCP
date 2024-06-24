package day13_3;

public class Fighter extends Airplane implements Weapon {
	
	public Fighter() {
		System.out.println("Fighter");
	}
	
	@Override
	public void shoot() {
		System.out.println("發射響尾蛇飛彈");
	}

	@Override
	void move() {
		System.out.println("飛行速度 2.5 馬赫");
	}

}
