package uk.warley.ganesh.chapter7.methodsandencapsulation;

public class StaticDemo {

	public static void main(String[] args) {
		StaticDemo demo = new StaticDemo();
		demo.method1();

		StaticDemo demo2 = null;
		demo2.method1();// still works as compliler converts it into StaticDemo.method1()

		StaticDemo.method1();
	}

	static void method1() {
		System.out.println("method1");
	}
}
