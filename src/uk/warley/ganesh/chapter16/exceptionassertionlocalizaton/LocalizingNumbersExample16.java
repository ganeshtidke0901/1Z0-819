package uk.warley.ganesh.chapter16.exceptionassertionlocalizaton;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class LocalizingNumbersExample16 {
	public static void main(String[] args) {
		long n = 12345;// or long
		Locale frLocale = new Locale("fr", "FR");

		NumberFormat format1 = NumberFormat.getInstance();
		NumberFormat format2 = NumberFormat.getInstance(frLocale);

		NumberFormat format3 = NumberFormat.getNumberInstance();
		NumberFormat format4 = NumberFormat.getNumberInstance(frLocale);

		NumberFormat format5 = NumberFormat.getCurrencyInstance();
		NumberFormat format6 = NumberFormat.getCurrencyInstance(frLocale);

		NumberFormat format7 = NumberFormat.getPercentInstance();
		NumberFormat format8 = NumberFormat.getPercentInstance(frLocale);

		NumberFormat format9 = NumberFormat.getIntegerInstance();
		NumberFormat format10 = NumberFormat.getIntegerInstance(frLocale);

		System.out.println(format1.format(n));// 12,345
		System.out.println(format2.format(n));// 12 345
		System.out.println(format3.format(n));// 12,345
		System.out.println(format4.format(n));// 12 345
		System.out.println(format5.format(n));// £12,345.00
		System.out.println(format6.format(n));// 12 345,00 €
		System.out.println(format7.format(n));// 1,234,500%
		System.out.println(format8.format(n));// 1 234 500 %
		System.out.println(format9.format(12345.22225));// 12,345
		System.out.println(format10.format(12345.52225));// 12 346

		try {
			Number d = format1.parse("12,345");
			System.out.println(d);// 12345

			Number d1 = format1.parse("12 345");
			System.out.println(d1);// 12

			System.out.println(format2.parse("12,345"));// 12.345-in french , is decimal seprarator LOL
			System.out.println(format3.parse("12345,11"));// 1234511
			System.out.println(format4.parse("12345,11"));// 12345.11

			System.out.println(format5.parse("£12,345.00"));// 12345
//			System.out.println(format6.parse("£12,345.00"));//Unparseable number: "£12,345.00"

			System.out.println(format6.parse("12 345,00 €"));// 12345

			System.out.println(format7.parse("1,234,500%"));// 12345
//			System.out.println(format7.parse("1 234 500 %"));//Unparseable number: "1 234 500 %"
			System.out.println((Double)format8.parse("1 234 500,99 %"));// 12345.0099

		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		NumberFormat format11=new DecimalFormat("###,###,###.0");
		System.out.println(format11.format(12345.78));//12,345.8
		
		NumberFormat format12=new DecimalFormat("###,###,###.00");
		System.out.println(format12.format(12345));//12,345.00
		
		
		NumberFormat format13=new DecimalFormat("000,000,000.00");
		System.out.println(format13.format(12345));//000,012,345.00
		
		

	}
}
