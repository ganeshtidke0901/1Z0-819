package uk.warley.ganesh.chapter13.annotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SafeVarargsExample12 {
	public static void main(String[] args) {
		test(new ArrayList<String>());
	}

	@SafeVarargs // is applied to method(final, private, static) and constructor that cant be overriden
	static void test(List<String>... s) {
		Object[] t = s;
		t[0] = Arrays.asList(1, 23);
	}
}








//>javac -cp . -Xlint:unchecked uk/warley/ganesh/chapter13/annotations/SafeVarargsExample1.java

//uk\warley\ganesh\chapter13\annotations\SafeVarargsExample1.java:11: warning: [unchecked] Possible heap pollution from parameterized vararg type List<String>

//javac -cp . uk/warley/ganesh/chapter13/annotations/SafeVarargsExample1.java
//Note: uk\warley\ganesh\chapter13\annotations\SafeVarargsExample1.java uses unchecked or unsafe operations.
