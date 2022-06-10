package HomeWork;

public class HW3 {
	
	void palindrome(String word) {
		String rev = "";
		for(int b = word.length()-1; b>=0;b--) {
			rev = rev + word.charAt(b);
		}
		if(rev.equalsIgnoreCase(word)) {
			System.out.println(word + " is palindrome");
		} else {
			System.out.println(word + " is not palindrome");
		}
	}

	public static void main(String[] args) {
		/*
		 * Create a method that will print whether given String is palindrome or not. 
		 */
		HW3 a = new HW3();
		a.palindrome("anna");
	}

}
