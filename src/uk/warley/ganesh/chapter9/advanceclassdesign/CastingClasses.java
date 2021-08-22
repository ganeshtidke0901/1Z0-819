package uk.warley.ganesh.chapter9.advanceclassdesign;

class Parent1 {
}

class Child1 extends Parent1 {
}

public class CastingClasses {

	static void tests1() {

		Child1 child = new Child1();
		Parent1 parent = child;
		child = (Child1) parent;

	}

	static void tests2() {

		Parent1 parent = new Parent1();

		Child1 child = null;
		// compiler allows as reference types in hierarchy
		// ClassCastException
		child = (Child1) parent;
	}

	static void tests3() {

//		Parent1 parent13=new CastingClasses();//compiler error as both reference types are not in any hierarchy

	}

	static void tests4() {
		Child1 child = new Child1();
		Parent1 parent = child;
		child = (Child1) parent;
		System.out.println(child instanceof Parent1);//true
		System.out.println(parent instanceof Child1);//true
		
		
		
	}
	static void tests5() {
		Parent1 parent= new Parent1();
		Child1 child=null;
		System.out.println(child instanceof Parent1);//false
		System.out.println(parent instanceof Child1);//false
		
		if(parent instanceof Child1) //false
		{
			child=(Child1) parent;
		}
		
		
	}
	public static void main(String[] args) {
		tests5();
	}
}
