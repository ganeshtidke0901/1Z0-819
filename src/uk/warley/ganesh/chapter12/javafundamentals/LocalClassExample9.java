package uk.warley.ganesh.chapter12.javafundamentals;

public class LocalClassExample9 {
	private static int a = 1;
	private int b = 2;

	private void test1() {

		int a = 3;

		class Inner1 {
//			private static int a;//cant be declared static unless is constant (final static)
			private final static int a = 4;
			private int b = 5;

			private void printMe() {
				int a = 6;
				System.out.println("Inner1 :" + a + "---" + b);// Inner1 :6---5
				System.out.println("Inner1 :" + this.a + "---" + this.b);// Inner1 :4---5
				System.out.println("Inner1 :" + LocalClassExample9.this.a + "---" + LocalClassExample9.this.b);// Inner1
																												// :1---2

			}
//				public static void printMe2() {}//cant have static method

//				public final static void printMe2() {}//cant have even final static method 
		}

		Inner1 inner1 = new Inner1();
		inner1.printMe();

	}

	public void test2() {
		int a = 3;
		class Inner1 {
			private void printMe() {
				System.out.println("Inner1 :" + a + "---" + b);// Inner1 :3---2
				System.out.println("Inner1 :" + LocalClassExample9.this.a + "---" + LocalClassExample9.this.b);// Inner1
																												// :1---2

			}
//				public static void printMe2() {}//cant have static method

//				public final static void printMe2() {}//cant have even final static method 
		}
//		  a=4; //if uncommented , a becomes non effectively final so error at line 52
		Inner1 inner1 = new Inner1();
		inner1.printMe();

	}

	public static void test3() {

		int a = 3;
		final int b = 10;
		class Inner1 {
//			private  static int a = 4;
			private int b = 5;

			private void printMe() {
				System.out.println("Inner1 :" + a + "---" + b);// Inner1 :3---10
				// following line wont work as inner clas in static method -no way of accessing outerclass instance
				// we can access bby creating instance of outer clas and access
//					System.out.println("Inner1 :" + LocalClassExample3.this.a + "---" +LocalClassExample3.this.b);

			}
//				public static void printMe2() {}//cant have static method

//				public final static void printMe2() {}//cant have even final static method 
		}
//		  a=4; //if uncommented , a becomes non effectively final so error at line 83
		Inner1 inner1 = new Inner1();
		inner1.printMe();

	}

	public static void main(String[] args) {

		new LocalClassExample9().test1();
		new LocalClassExample9().test2();
		new LocalClassExample9().test3();

	}
}