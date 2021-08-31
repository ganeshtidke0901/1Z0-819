package uk.warley.ganesh.chapter12.javafundamentals;

enum Season {
	WINTER("winter") {

		@Override
		public String getHours() {
			return "10am-4pm";
		}

	},
	SUMMER("Hot") {

		@Override
		public String getHours() {
			return "9am- 6pm";
		}

	};

	Season(String string) {
		this.str = string;
	}

//	Season() { //error as final str is not intialized anywhere so has to be in constrcutor 
//	
//	}

	private final String str;

	public static void test() {
		System.out.println("static");
	}
	
	public abstract String getHours();

}

public class EnumExample3 {
	public static void main(String[] args) {
		Season winter=Season.WINTER;
		System.out.println(winter.getHours());//10am-4pm
		winter.test();//static 
		Season.test();//static 
		
	}
}