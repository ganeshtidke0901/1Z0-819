package uk.warley.ganesh.chapter16.exceptionassertionlocalizaton;

public class EffectivelyFinalTryWithResourcesExceptionExample6 {

	final static MySomethinigReader5 mySomethinigReader6 = new MySomethinigReader5();
	static MySomethinigReader5 mySomethinigReader7 = new MySomethinigReader5();

	public static void main(String[] args) {

//		MySomethinigReader5 mySomethinigReader5 = new MySomethinigReader5();
//		try (MySomethinigReader4 mySomethinigReader4 = new MySomethinigReader4(); mySomethinigReader5) {//error: Local variable mySomethinigReader5 defined in an enclosing scope must be final or effectively final
//
//		}
//		mySomethinigReader5=null;

		MySomethinigReader5 mySomethinigReader5 = new MySomethinigReader5();
		try (MySomethinigReader4 mySomethinigReader4 = new MySomethinigReader4(); mySomethinigReader5) {
		}

//		Closed3
//		Closed2

		try (MySomethinigReader4 mySomethinigReader4 = new MySomethinigReader4(); mySomethinigReader6) {// should be
																										// final in this
																										// case

		}
//		Closed3
//		Closed2
	}
}

class MySomethinigReader4 implements AutoCloseable {

	@Override
	public void close() {
		System.out.println("Closed2");
	}
}

class MySomethinigReader5 implements AutoCloseable {

	@Override
	public void close() {
		System.out.println("Closed3");
	}
}