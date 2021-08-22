package uk.warley.ganesh.chapter8.classdesign;

class AC4 {
	protected String name = "Parent";

	public String test() {
		return name;
	}

	public String test2() {
		return this.name + ":" + this.test();// this is optional
	}

	public String test3() {
		return this.name + ":" + this.test();// this is optional
	}

}

public class HidingVariables extends AC4 {

	// hiding the name from parent
	protected String name = "Child";

	@Override
	public String test() {
		return name;
	}

	public String test3() {
		return this.name + ":" + this.test();// this is optional
	}

	public static void main(String[] args) {
		HidingVariables hidingVariables = new HidingVariables();
		AC4 ac4 = hidingVariables;
		System.out.println(ac4.name);// Parent
		System.out.println(hidingVariables.name);// Child
		System.out.println(ac4.test());// Child as it will always call child object method(overriding)
		System.out.println(hidingVariables.test());// Child as it will always call child object method(overriding)

		// ********************************************************
		System.out.println(hidingVariables.test2());// Parent:Child
		// ********************************************************
		System.out.println(hidingVariables.test3());// Child:Child

		// ********************************************************
		System.out.println(ac4.test2());// Parent:Child
		// ********************************************************
		System.out.println(ac4.test3());// Child:Child

	
	}
}
