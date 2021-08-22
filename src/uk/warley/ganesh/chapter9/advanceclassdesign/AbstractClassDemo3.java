package uk.warley.ganesh.chapter9.advanceclassdesign;

import java.util.ArrayList;
import java.util.List;

abstract class Class5 {
	public abstract void show();

	abstract public List<String> test();

}



abstract class Class6 extends Class5 {
//	abstract void show();//fail as super class method access modifier is public and this is default

	abstract public ArrayList<String> test() throws RuntimeException;

}


//cant be final and abstact
//abstract final class7{
//	
//}

public class AbstractClassDemo3 {
}
