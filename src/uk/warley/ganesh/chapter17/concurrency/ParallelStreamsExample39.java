package uk.warley.ganesh.chapter17.concurrency;

import java.util.List;
import java.util.stream.Stream;


public class ParallelStreamsExample39 {

	public static void main(String[] args) {
		 
		Stream<Integer> stream=Stream.of(1,2,3,4);
		Stream<Integer> parallelStream=stream.parallel();
		System.out.println(stream.isParallel());//true

		Stream<Integer> parallelStream2=List.of(1,2,3,4).parallelStream();
		
		
		
		
	}
}