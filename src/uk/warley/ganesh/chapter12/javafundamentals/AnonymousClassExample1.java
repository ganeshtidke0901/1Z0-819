package uk.warley.ganesh.chapter12.javafundamentals;

public class AnonymousClassExample1 {

	abstract class SaleTodayOnly {
		abstract int dollarOff();
	}

	public int admission(int basePrice) {
		int moreDiscount = 1;
		final int lessDiscount = 2;
		SaleTodayOnly only = new SaleTodayOnly() {

			@Override
			int dollarOff() {
				return 3 + moreDiscount - lessDiscount;
			}
		};
//		moreDiscount=12;//should be effectively final or final
		return basePrice - only.dollarOff();
	}

	public static void main(String[] args) {

	}
}
