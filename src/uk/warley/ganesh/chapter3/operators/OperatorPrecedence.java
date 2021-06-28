package uk.warley.ganesh.chapter3.operators;

public class OperatorPrecedence {

	public static void main(String[] args) {

		example9();
	}

	public static void example1() {
		int a = 10;
//		int b=10++;
		int b = 20;
		int c = a++ * 2 + ++a * 5;
		System.out.println("a=" + a + " b=" + b + " c=" + c);

	}

	public static void example2() {
		int a = 10;
		int b = 20;
		int c = a++ * (byte) -++a;
		System.out.println("a=" + a + " b=" + b + " c=" + c);
		byte d = -0b0000011;
		System.out.println(Integer.toBinaryString(d));

	}

	public static void example3() {
		int a = 10;
		int b = 20;
		int c = a++ * ++b % a++;
		System.out.println(c);

	}

	public static void example4() {
		int a = 10;
		int b = 20;
		int c = a++ * ++b % a++ << 2;
		System.out.println(c);

	}

	public static void example5() {
		int a = 10;
		int b = 20;
		int c = (byte) a++ * ++b % a++ << 2; // a++ applied first, ++b , (byte) ,* , <</>>/>>>
		System.out.println(c);

	}

	public static void example6() {
		int a = 10;
		int b = 20;

		boolean c = b> a && b > 0 && null instanceof String;

		System.out.println(c);

	}
	
	public static void example7() {
		int a = 10;
		int b = 20;

		boolean c = b> a & b > 0 && null instanceof String | b<a == b>1==false; //(>,<,>=,<=,instanceof), (==,!=) ,(&,|),
		System.out.println(true&true&& false|false==true==false);
		System.out.println(true&true&& false|true);
		System.out.println(true&& true);
		System.out.println(true);
		System.out.println(c);

	}
	public static void example8() {
		int a = 10;
		int b = 20;
		int c=   ~-(short)a;
		System.out.println(~-10);
		System.out.println(~(-10));
		System.out.println(c);
		
		int d= -~(short)a;
		System.out.println(-~a);
		System.out.println(-(-11));
		System.out.println(d);
	}

	

	public static void example9() {
		int a = 10;
		int b = 20;

		boolean c = b> a & b > 0 && null instanceof String | b<a == b>1==false && a>b?false:true; //(>,<,>=,<=,instanceof), (==,!=) ,(&,|),
		System.out.println(true&true&& false|false==true==false&& false?false:true);
		System.out.println(true&true&& false|true&& false?false:true);
		System.out.println(true&& true&& false?false:true);
		System.out.println(true&& false?false:true);
		System.out.println(false?false:true);
		System.out.println(c);

	}
}
