package uk.warley.ganesh.chapter18.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrentClassesExample36 {
	List<String> copyOnWriteListy=new CopyOnWriteArrayList<>();
	List<String> list=new ArrayList<>();
	
	public static void main(String[] args) {

		var a=new ConcurrentClassesExample36();
		
		Runnable writer=()->{
				a.copyOnWriteListy.add("Ganesh");
				a.list.add("Tidke");

		};

		
		Runnable reader=()->{
				System.out.println("copyOnArrayList:"+a.copyOnWriteListy);
				System.out.println("List:"+a.list);
		};

		ExecutorService executorService=Executors.newFixedThreadPool(10);
		for (int i = 0; i < 10; i++) {
			executorService.submit(writer);
			executorService.submit(reader);
		}
		
		executorService.shutdown();
		try {
			executorService.awaitTermination(4, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End:"+a.list+" Size:"+a.list.size());// java.util.ConcurrentModificationException
		//End:[Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke] Size:9
		//End:[Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke] Size:10
		System.out.println("End:"+a.copyOnWriteListy+"  Size:"+a.copyOnWriteListy.size());// java.util.ConcurrentModificationException
		
		//End:[Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh]  Size:10
		//End:[Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh]  Size:10
		//End:[Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh]  Size:10
		
		
		
		//any concurrent classes - make sure at any point update/modification/write being done on shared data, reader will always get consistent data either old or latest based on when reader reads the data
		//CopyOnWrite is same 
		
		
		
//				copyOnArrayList:[Ganesh, Ganesh, Ganesh, Ganesh]
//				copyOnArrayList:[Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh]
//				copyOnArrayList:[Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh]
//				copyOnArrayList:[Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh]
//				copyOnArrayList:[Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh]
//				copyOnArrayList:[Ganesh, Ganesh, Ganesh, Ganesh, Ganesh]
//				copyOnArrayList:[Ganesh, Ganesh, Ganesh, Ganesh]
//				copyOnArrayList:[Ganesh, Ganesh, Ganesh]
//				copyOnArrayList:[Ganesh, Ganesh, Ganesh]
//				List:[Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke]
//				copyOnArrayList:[Ganesh, Ganesh, Ganesh]
//				List:[Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke]
//				List:[Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke]
//				List:[Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke]
//				List:[Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke]
//				List:[Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke]
//				List:[Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke]
//				List:[Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke]
//				List:[Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke]
//				List:[Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke]
//				End:[Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke, Tidke] Size:10
//				End:[Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh, Ganesh]  Size:10

		
	}
}