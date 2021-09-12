package uk.warley.ganesh.chapter15.streams;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamExample1 {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Ganesh", "Tidke");
		Consumer<? super CharSequence> consumer1 = s -> System.out.println(s);
		Consumer<? super String> consumer2 = s -> System.out.println(s);

		stream.forEach(consumer1);
		stream.forEach(consumer2);

		// because consumer2 can point to <String>, <CharSequence> <Object>
		// consumer1 can point to CharSequence
		consumer2 = consumer1;

		Consumer<? super CharSequence> consumer3 = s -> System.out.println(s);

		Consumer<? super Object> consumer4;

		//consumer3=consumer4; // compiler error -consumer3 can take only CharSequence
								// consumer4 can take only Object

//		consumer4=consumer3;//compiler error

	}
}
