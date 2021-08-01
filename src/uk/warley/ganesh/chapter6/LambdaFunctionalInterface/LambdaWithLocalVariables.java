package uk.warley.ganesh.chapter6.LambdaFunctionalInterface;

import java.util.function.Predicate;

public class LambdaWithLocalVariables {
	private String name;
	private static String surname;

	public static void main(String[] args) {
//		new LambdaWithLocalVariables().example1("MR.");
//		example2();
//		example3();
		new LambdaWithLocalVariables().example4("");
		example5();
	}

	private void example1(final String str) {

		Predicate<String> predicate = s -> {
			String s1 = "Hello";
			String s2 = name + s1;
			String s3 = str + 1;
			name = "Ganesh";
			surname = "Tidke";
			// str="xyz";//Not possible as str should be final or effectively final and can
			// only read values not update it
			return s3.isEmpty();
		};
		String s1 = "";//
//		System.out.println(predicate.test("ffd"));
		System.out.println(name);
		System.out.println(surname);
		example2(predicate);

	}

	private void example2(Predicate<String> p) {
		p.test("afad");
		System.out.println(name);
		System.out.println(surname);
	}

	private static void example3(int a) {
//		int b = 1;
//		Predicate<Integer> p1 = a -> { //a is reused
//
//			int b = 0;//b is local variable so cant use here
//			int c = 0;
//			return b == c;
//		};

	}

	private void example4(String str) {

		String s1;
		String s2 = "Ganesh";
		Predicate<String> predicate = new Predicate<String>() {
			int a;
			String s1;

			@Override
			public boolean test(String t) {
				name = "";
				System.out.println(str);
//				 str="";//Not possible as str should be final or effectively final and can
				// only read values not update it
				String s1 = "";
				String str = "N";
//				System.out.println(s2);//Not effectively final
				return false;
			}
		};
		s2 = "";

	}

	private static void example5() {

		for (int i = 0; i < 3; i++) {
			Predicate<Integer> predicate = s -> {
//				System.out.println(i);//i++ making condition of being not effectively final 
				return true;
			};
		}

	}
}
