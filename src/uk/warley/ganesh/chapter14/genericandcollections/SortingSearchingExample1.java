package uk.warley.ganesh.chapter14.genericandcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingSearchingExample1 {
	public static void main(String[] args) {
		
		List<SortRabbits> list=new ArrayList<SortRabbits>();
		list.add(new SortRabbits());
		list.add(new SortRabbits());
		
//		Collections.sort(list); //error as SortRabbits has to implement Comparable
		
		
		List<SortMonkeys> monkeys=new ArrayList<SortMonkeys>();
		monkeys.add(new SortMonkeys());
		monkeys.add(new SortMonkeys());
		
		Collections.sort(monkeys);
		
		
		var s=Arrays.asList(12,10,23,100);
		
		System.out.println(Collections.binarySearch(s, 12));
		
		Collections.sort(s);//Integer implements Comparable
		System.out.println(Collections.binarySearch(s, 12));//1
		System.out.println(Collections.binarySearch(s, 1));// -0-1=-1
		
		
		
	}
}
class SortRabbits
{

}


class SortMonkeys implements Comparable<SortMonkeys>
{

	@Override
	public int compareTo(SortMonkeys o) {
		return 0;
	}

}