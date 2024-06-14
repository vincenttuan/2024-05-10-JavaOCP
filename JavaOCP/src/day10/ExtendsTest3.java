package day10;

class Father {
	Father(char c) {
		System.out.println(c);
	}
	
}

class Son extends Father {
	Son() {
		super('C');
		System.out.println("B");
	}
}

public class ExtendsTest3 {

	public static void main(String[] args) {
		Son son = new Son();
	}

}
