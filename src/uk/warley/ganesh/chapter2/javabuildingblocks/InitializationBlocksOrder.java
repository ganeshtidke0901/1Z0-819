package uk.warley.ganesh.chapter2.javabuildingblocks;

public class InitializationBlocksOrder {

	int b = 10;
	{
//		System.out.println(a);
		System.out.println("Instance Initializer block:" + b);
	}

	public InitializationBlocksOrder() {
		b = 20;
		a = 10;
		System.out.println("Constructor b:" + b);
		System.out.println("Constructor a:" + a);

	}

	public static void main(String[] args) {
//		var i = new InitializationBlocksOrder();
//		AA aa=new AA();
		AA aa=null;
	}

	public void instanceMethod1() {
		System.out.println("InstanceMethod1 a:" + a);

	}

	int a;

	static {
//		System.out.println(a);
		System.out.println("static Initializer block:");
	}
}



class AA{
	static {
//		System.out.println(a);
		System.out.println("AA static Initializer block:");
	}
	public static void mm() {
		
		System.out.println("AA static method:");
		
	}
	
}