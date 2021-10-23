package uk.warley.ganesh.chapter14.genericandcollections;

import java.util.ArrayList;

public class GenericsMethodsExample19 {
	public static void main(String[] args) {

		Generic4.<String>test("Ganesh");// explicitly telling T type
		Generic4.test("Ganesh");// implicitly telling T type based on argument type

		Generic4 generic4 = new Generic4();
		generic4.test2(null);// T =Object
		generic4.test2(12);// T =Integer
		generic4.<Double>test2(1d);// T =Double
//		generic4.<Double>test2(1);// error as Explicitly mentioned type is Double and you passing 1--> Integer not Double

		generic4.test2(new ArrayList<String>());// T = ArrayList
	}

}

class Generic4 {

	public static <T> void test(T a) {
		System.out.println("generic method:" + a);
	}

	public <T> void test2(T a) {
		System.out.println("generic method:" + a);
	}
	
	
}
