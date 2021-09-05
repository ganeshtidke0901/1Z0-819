package uk.warley.ganesh.chapter14.genericandcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class FactoryExample1 {
	public static void main(String[] args) {
		Integer[] integer = { 1, 2, 3, 4 };

//		ArrayList<Integer> list1 = (ArrayList<Integer>) Arrays.asList(1, 2, 3);//Arrays$ArrayList being assined to ArrayList java.lang.ClassCastException:

		List<String> list = new ArrayList<String>();
		ArrayList<String> arrayList = (ArrayList<String>) list;

		List<Integer> list2 = Arrays.asList(integer);// fixed size list
		List<Integer> list3 = List.of(integer);// immutable list
		List<Integer> list4 = List.copyOf(list3);// immutable list
		List<Integer> list5 = List.of();// empty immutable list

//		list2.add(100);// java.lang.UnsupportedOperationException
//		list3.add(100);// java.lang.UnsupportedOperationException
//		list4.add(100);// java.lang.UnsupportedOperationException
//		

		list2.set(0, 11);// [11, 2, 3, 4]
		System.out.println(list2);// [11, 2, 3, 4]
//		list3.set(0, 11);//java.lang.UnsupportedOperationException
//		list4.set(0, 11);//java.lang.UnsupportedOperationException
		
		Set<String> set1=Set.of();//immutable
		Set<String> set2=Set.of("Ganesh","Tidke");//immutable
//		Set<String> set3=Set.copyOf("Ganesh","Tidke");//takes collection as argument
		Set<String> set3=Set.copyOf(set2);//immutable
		
		
	}
}
