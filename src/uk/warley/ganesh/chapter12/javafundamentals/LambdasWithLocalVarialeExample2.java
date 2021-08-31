package uk.warley.ganesh.chapter12.javafundamentals;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class LambdasWithLocalVarialeExample2 {
	int n;
	
	BiPredicate<String, Boolean> p1 = (final var var1, final var var) -> {
		System.out.println(n);
		return true;
	};
	
	public void test()
	{
		BiPredicate<String, Boolean> p2 = (final var var1, final var var) -> {
			System.out.println(n);
			return true;
		};
	}
	
	public void test1(int var1)
	{
//		BiPredicate<String, Boolean> p2 = (final var var1, final var var) -> {  //cant use var1 local varible ass parameter
//			System.out.println(n);
//			return true;
//		};
		
		BiPredicate<String, Boolean> p2 = (final var var2, final var var3) -> {  //cant use var1 local varible ass parameter
//		int var1=11;//cant use local variable 
		return true;
	};
	}
	public static void main(String[] args) {

		int a;// should be final or effectively final to be used in lambda bodies as we do for anonymous class
				// body
		a=11;
		BiPredicate<String, Boolean> p8 = (final var var1, final var var) -> {
			System.out.println(a);
//			System.out.println(n);//lambda declared in static method 
			return true;
		};

//		a=22; //line 13 will fail as it will no longer be effecively final
	}

}
