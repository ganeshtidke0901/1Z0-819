
package uk.warley.ganesh.chapter5.corejavaapis;

import java.util.ArrayList;
import java.util.List;

public class StringConcatenation {
	public static void main(String[] args) {
//		example1();
		example2();
	}

	private static void example1() {

		String s1 = "ganesh";
		s1 += 1 + 2;
		System.out.println(s1);
		s1 += 5;
		System.out.println(s1);

		String s2 = "ganesh";
		System.out.println(1 + 2 + s2);
		System.out.println(s2 + 1 + 2);
		System.out.println(s2 + 2 * 3);

	}

	private static void example2() {
		String s1="Ganesh";
		String s2=new String();
		System.out.println(s2);
		
		String s3=new String(new byte[] {65,66,76,90});
		System.out.println(s3);
		
	}

}
