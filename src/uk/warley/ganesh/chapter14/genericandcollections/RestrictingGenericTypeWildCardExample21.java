
package uk.warley.ganesh.chapter14.genericandcollections;

import java.util.ArrayList;
import java.util.List;

public class RestrictingGenericTypeWildCardExample21 {

	// need to specify T type before void
//	void test(List<T> a)
//	{
//	} 

	// parameters should always be wildcard or specific type  List<? extends A0> or List<T> 
//	public static <T extends A0>void test(List<T extends A0> a)
//	{
//	} 

//	public static <T super A0>void test2222(T a)//super is not allowed
//	{
//	} 
	public static <T extends A0>void test(List<? extends T> a)
	{
	} 
	
	
	public static <T extends A0> void test(T a) {
	}

	public static <T extends A0> void test2(List<? extends A0> a) {
	}

	public static <T extends Comparable<? extends A0>> void test3(List<? extends A0> a, T b) {
	}

	public static void main(String[] args) {
		Generic5<A1> generic5 = new Generic5<A1>();
//		Generic5<Object> generic6=new Generic5<>();//Generic5 T has restriction to any class that extends A1
		Generic5<B1> generic6 = new Generic5<B1>();
		Generic5<C1> generic7 = new Generic5<C1>();
		Generic5<?> generic8 = new Generic5<C1>();
		Generic5<?> generic9 = new Generic5<C1>();
		Generic5<?> generic10 = new Generic5<C1>();

		Generic5<? extends A0> generic11;
//		Generic5<? extends A0> generic12=new Generic5<A0>();//A0 is not allowed in right hand side as A0 does not extend A1

//		test(new Object());//notpossible
		test(new A0());
		test(new A1());
		test(new B1());
		test(new C1());
		
		Generic7<GGG>generic72 =new Generic7<GGG>();

	}
}

//restriction to type parameter
class Generic5<T extends A1> {
	T a;
}

class Generic6<T extends Comparable<? super T>> {// while limiting the T type , should be fine Comparable<? extends T>
	T a;
}

class Generic7<T extends Comparable<? extends T>> {// while limiting the T type , should be fine Comparable<? extends T>
	T a;
}

//Not allowed
//class Generic6<T super A1> {
//	T a;
//}

//class Generic6<? extends A1> {
//}

class A0 {

}

class A1 extends A0 {

}

class B1 extends A1 {
}

class C1 extends B1 {
}

class GGG implements Comparable<GGG1>{

	@Override
	public int compareTo(GGG1 o) {
		return 0;
	}
	
}
class GGG1 extends GGG{}


