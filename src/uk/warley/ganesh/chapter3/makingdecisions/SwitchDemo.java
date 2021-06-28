package uk.warley.ganesh.chapter3.makingdecisions;

public class SwitchDemo {
	public static void main(String[] args) {
//		example1();
//		example2((byte) 10);
//		example3(10);
//		example4();
//		example5();
		__(10);
		example6();

	}

	private static void __(int a) {
		switch (a) {
		case 1:
			System.out.println(1);
		default:
			System.out.println("default");
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
		}
	}

	private static void example5() {
		int a = 10;
		switch (a) {
		case 10:

			break;

		default:
			break;
		}

	}

	private static void example4() {
		int a = 20;
		switch (20) {
		}

		switch (a) {
		}
	}

	private static void example3(final int e) {
		final int a = 10;
		int b = 10;
		short c = 10;
		long d = 10;
		float f = 10;
		boolean g = false;
		switch (10) {
		default:
		case a:
//		case getMESameValue(); //does not allow runtime value

//	case b: //DOES NOT COMPILE //effectively final is not valid for switch .has to be compile time constant

//	case c: //DOES NOT COMPILE

//	case d: //DOES NOT COMPILE
//	case e: //DOES NOT COMPILE	
//	case f: //DOES NOT COMPILE	
//	case g: //DOES NOT COMPILE	
		}

	}

	private static int getMESameValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void example2(final byte a) {

		final int b = 100;
		switch (a) {
		case 100:
		case (int) 10.0f:
//		case 10*100: //DOES NOT COMPILE as 1000 can;t fit into byte a(byte a=1000;)
		case 127:

		}

		var e = (byte) 10;
		switch (e) {
//		case 128:// e is of type byte

		default:
			break;
		}

		switch ("ganesh") {
		case "A":

			break;

		default:
			break;
		}

	}

	private static void example1() {
		byte a = 0;
		switch (a) {
//		case "AA": //DOES NOT COMPILE as different type

		default:
			break;
		}

		final Long l = 20L;
//		switch (l) { //long/Long, float/FLOAT, boolean/Boolean not valid for switch
//		case 20:
//		}

		switch (a) {
//		case l: //DOES NOT COMPILE

		}
//		
//		Runnable runnable=()->{
//			System.out.println(a);//a should be final/Effectively final but a has been assigned a vavlue 
//		};
//		a=1;
	}

	private static void example6() {
		int a = 10;
		switch (a) {
		case 10:
			int c=10;
			break;
		case 11:
//			int c=10;//duplicate c as it is delcraed wtice inn same block
			break;
		default:
			break;
		}
		
		switch (a) {
		case 10:
			{int c=10;}
			break;
		case 11:
			int c=10; // 150 line c has its own scope .so itworks
			break;
		default:
			break;
		}
	}
}
