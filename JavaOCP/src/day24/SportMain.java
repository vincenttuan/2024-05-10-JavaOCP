package day24;

public class SportMain {
	public static void main(String[] args) {
		
		SportThread st1 = new SportThread();
		SportThread st2 = new SportThread();
		SportThread st3 = new SportThread();
		
		st1.setName("小帥");
		st2.setName("美玲");
		st3.setName("John");
		
		
		st1.start();
		st2.start();
		st3.start();
		
	}
}
