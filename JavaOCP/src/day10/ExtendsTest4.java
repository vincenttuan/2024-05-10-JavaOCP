package day10;

class Foo {
	Foo() {
		System.out.println("A");
	}
	Foo(int x) {
		this();
		System.out.println("B");
	}
}

class Bar extends Foo {
	Bar() {
		this(0);
		System.out.println("C");
	}
	Bar(int x) {
		super(x);
		System.out.println("D");
	}
}

public class ExtendsTest4 {

	public static void main(String[] args) {
		Bar bar = new Bar();
	}

}
