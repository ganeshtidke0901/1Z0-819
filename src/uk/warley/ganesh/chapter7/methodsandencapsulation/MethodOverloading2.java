package uk.warley.ganesh.chapter7.methodsandencapsulation;

public class MethodOverloading2 {
	public static void main(String[] args) {
		fly();//d  >=0 parameters
		fly(2);//j  Larger primitives
		fly((short)2);//j  autoboxing
		fly(2.2);//o  float> Float> Object
		//rule
		// Exact match-> larger primitives-> Autoboxing--> var args
	}

	
	public static void fly(Integer  a) {
		System.out.println("h");
	}
	public static void fly(float  a) {
		System.out.println("j");
	}
	public static void fly(Object a) {
		System.out.println("o");
	}

	public static int fly(int... a) {
		System.out.println("d");
		return 0;
	}
	
	//already defined by varargs int ...a
//	public static int fly(int[] a) {
//		System.out.println("d");
//		return 0;
//	}

}
