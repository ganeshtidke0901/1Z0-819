package uk.warley.ganesh.chapter12.javafundamentals;

import java.util.ArrayList;
import java.util.List;

//@FunctionalInterface//optional
interface Walk {
	default int getSpeed() {//implicityly public
		return 5;
	}

//	default int xyz() {//implicityly public
//		return 5;
//	}

	default List<String> abc() {//implicityly public
		return null;
	}
}

interface Run {
	default int getSpeed() {//implicityly public
		return 3;
	}
//	default void xyz() {//implicityly public
//		
//	}
	
	default ArrayList<String> abc() {//implicityly public
		return null;
	}
}

//must override getSpeed as it is there in both interfaces
public class InterfaceDefaultMethodExample1 implements Run,Walk{

	@Override
	public int getSpeed() {
		return 10;
	}
	
	void test() {
		System.out.println(Walk.super.getSpeed());//5
		System.out.println(Run.super.getSpeed());//3
		System.out.println(this.getSpeed());//10
		
	}
	
//	@Override
//	public void xyz() {  cant ovveride as both interface method does not match the return time(not even covarient)
//	}

	@Override
	public ArrayList<String> abc() { //covarient return ty
		return Run.super.abc();
	}

	public static void main(String[] args) {
		new InterfaceDefaultMethodExample1().test();
	}
}
