package HomeWork;

public class HW4 {
	
	void hello(String greet) {
		if(greet.equalsIgnoreCase("English")) {
			System.out.println("Hello");
		} else if(greet.equalsIgnoreCase("Spainish")) {
			System.out.println("Hola");
		} else if(greet.equalsIgnoreCase("Uzbek")) {
			System.out.println("Assalamualaikum");
		} else if(greet.equalsIgnoreCase("Korean")) {
			System.out.println("Annyeonghasimnikka");
		} else {
			System.out.println("Uknown language");
		}
	}
	
	public static void main(String[] args) {
		/*
		 * Create a method that will say Hello in different language based on the country that will passed when method is executed 
		 */
		HW4 a = new HW4();
		a.hello("Korean");
	}

}
