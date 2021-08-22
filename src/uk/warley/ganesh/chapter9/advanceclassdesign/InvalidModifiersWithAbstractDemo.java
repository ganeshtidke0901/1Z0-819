package uk.warley.ganesh.chapter9.advanceclassdesign;

abstract class Class4 {

// abstract method has to be overridden but static is for hiding not for overriding so does not work
//	public abstract static void test();

	// abstract method has to be overridden but private is never inherited so does not work
//		public abstract private void test();

	// abstract method has to be overridden but final is to be never overridden
//		public abstract final void test();

	static private void test() {
	}

	final private void test2() {
	}

	final static void test3() {
	}

}


public class InvalidModifiersWithAbstractDemo {

}