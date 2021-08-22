package uk.warley.ganesh.chapter8.classdesign;

class AC3 {

	final public static void test() {
		System.out.println("AC2 test");
	}

	final public void aa() {
		System.out.println("AC2 test");
	}

}

public class FinalMethods extends AC3 {

	
//	final method can't be overrided or hidden
//	public static void test() {
//		System.out.println("Child test");
//	}
//
//	@Override
//	public void aa() {
//		System.out.println("AC2 test");
//	}

	public static void main(String[] args) {
	}
}
