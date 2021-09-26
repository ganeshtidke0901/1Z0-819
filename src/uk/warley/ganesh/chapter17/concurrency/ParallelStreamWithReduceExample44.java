package uk.warley.ganesh.chapter17.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamWithReduceExample44 {
	public static void example1() {
		// -----------------------suppose to use concurrent classes like ConcuurentSkipListSet
		ArrayList<String> s = List.of("Ganesh", "Tidke").stream().collect(ArrayList::new, ArrayList::add,
				ArrayList::addAll);
		System.out.println(s);// [Ganesh, Tidke]

		ArrayList<String> list2 = List.of("Ganesh", "Tidke").stream().collect(Collectors.toCollection(ArrayList::new));
		System.out.println(list2);// [Ganesh, Tidke]

		ArrayList<String> list3 = List.of("Ganesh", "Tidke", "XZY", "ABC").stream().collect(() -> {
			var var = new ArrayList();
			System.out.println("hashcode" + var.hashCode());
			;
			return var;
		}, (list, str) -> {
			System.out.println("accumulator list:" + list + ".add(" + str + ")");
			list.add(str);
		}, (list11, list22) -> {
			System.out.println("Combiner:" + list11 + ".addAll(" + list22 + ")");
			list11.addAll(list22);
		});
		System.out.println(list3);
//		hashcode1
//		accumulator list:[].add(Ganesh)
//		accumulator list:[Ganesh].add(Tidke)
//		accumulator list:[Ganesh, Tidke].add(XZY)
//		accumulator list:[Ganesh, Tidke, XZY].add(ABC)
//		[Ganesh, Tidke, XZY, ABC]
	}

	public static void example2() {
		ArrayList<String> list3 = List.of("Ganesh", "Tidke", "XZY", "ABC").stream().parallel().collect(() -> {
			var var = new ArrayList();
			System.out.println("hashcode" + var.hashCode());
			;
			return var;
		}, (list, str) -> {
			System.out.println("accumulator list:" + list + ".add(" + str + ")");
			list.add(str);
		}, (list11, list22) -> {
			System.out.println("Combiner:" + list11 + ".addAll(" + list22 + ")");
			list11.addAll(list22);
		});
		System.out.println(list3);

		
//		hashcode1
//		hashcode1
//		accumulator list:[].add(Tidke)
//		hashcode1
//		hashcode1
//		accumulator list:[].add(Ganesh)
//		accumulator list:[].add(XZY)
//		Combiner:[Ganesh].addAll([Tidke])
//		accumulator list:[].add(ABC)
//		Combiner:[XZY].addAll([ABC])
//		Combiner:[Ganesh, Tidke].addAll([XZY, ABC])
//		[Ganesh, Tidke, XZY, ABC]
	}

	public static void example3() {

//		String s=List.of("a","b","c","d","e","f","g","h","i","j","k","l").parallelStream().reduce("X",(s1,s2)-> s1+s2);
//		or
		String s = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l").parallelStream().reduce("X",
				(s1, s2) -> {
					System.out.println(
							"Thread id" + Thread.currentThread().getId() + " Accumalator:" + s1 + "+" + s2 + "");
					return s1 + s2;
				});

		System.out.println(s);//
	}

	static void example4() {
	}

	public static void main(String[] args) {
//		example1();
		example2();
//		example3();
//		example4();
	}
}