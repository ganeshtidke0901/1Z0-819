package uk.warley.ganesh.chapter16.exceptionassertionlocalizaton;



public class SuppressedExceptionExample9 {

	static void example3() {

		try (JammedBrentwoodCage cage = new JammedBrentwoodCage()) {
		} 

		

	}
	

	public static void main(String[] args) {
		example3();
	}
}

class JammedBrentwoodCage implements AutoCloseable {

	@Override
	public void close()  {
		throw new IllegalStateException("cage door does not close");
	}
}


