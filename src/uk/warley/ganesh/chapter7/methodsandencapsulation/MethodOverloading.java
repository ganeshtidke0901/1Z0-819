package uk.warley.ganesh.chapter7.methodsandencapsulation;

public class MethodOverloading {
	public static void main(String[] args) {
		fly();//a
		fly(2);// exact matching
		fly((short)2);//g
		fly(2.2);//o
		
	}

	public static void fly() {
		System.out.println("a");
	}
	public static void fly(short d) {
		System.out.println("g");
	}
	public static void fly(Short s) {
		System.out.println("f");
	}

	public static void fly(int a) {
		System.out.println("b");
	}
	public static void fly(Integer  a) {
		System.out.println("h");
	}
	public static void fly(float  a) {
		System.out.println("j");
	}
	public static void fly(Object a) {
		System.out.println("o");
	}

	public static void fly(int b, short c) throws RuntimeException {
		System.out.println("c");
	}

	public static int fly(int... a) {
		System.out.println("d");
		return 0;
	}
}
