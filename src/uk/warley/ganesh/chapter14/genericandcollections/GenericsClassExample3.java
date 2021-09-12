package uk.warley.ganesh.chapter14.genericandcollections;

public class GenericsClassExample3 {
	public static void main(String[] args) {
		Generic3<String> g3 = () -> "Ganesh";

		// if dont declare generic type parameter while using , it becomes Object class
		Generic3 g4 = new Generic3() {
			@Override
			public Object test() {
				return null;
			}
		};

	}

}

interface Generic3<T> {
	T test();
}


