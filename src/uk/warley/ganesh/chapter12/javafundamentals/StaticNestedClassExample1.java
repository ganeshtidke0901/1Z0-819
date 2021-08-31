package uk.warley.ganesh.chapter12.javafundamentals;

public class StaticNestedClassExample1 {
	private static int a = 11;
	private int b = 12;

	private void test() {
	}

	static public class Inner1 {
		private static int a = 1;
		private int b = 2;

		private void printMe() {
			System.out.println("Printing inner1");
			System.out.println("Inner1 :" + a + "---" + b);// Inner1 :1---0
			System.out.println("Inner1 :" + this.a + "---" + this.b);// Inner1 :1---0
			StaticNestedClassExample1 classExample1 = new StaticNestedClassExample1();
			System.out.println(classExample1.b);// 12
			System.out.println(StaticNestedClassExample1.a);// 11
		}

		public static void printMe2() {
		}

		public final static void printMe3() {
		}
		
		}

	abstract static class Inner2 extends Inner1 {
	}

	final protected class Inner3 {
	}

	public class Inner4 {
	}

	public static void main(String[] args) {
		StaticNestedClassExample1.Inner1 inner1 = new Inner1();
		inner1.printMe();// outer class can access inner class private method
		System.out.println(inner1.a);// 1
		System.out.println(inner1.b);// 2
	}
}
