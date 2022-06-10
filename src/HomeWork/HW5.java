package HomeWork;

public class HW5 {
	
	void email(String name, String lastName, String mail) {
		System.out.println(name.toLowerCase()+lastName.toLowerCase()+"@"+mail.toLowerCase()+".com");
	}
	
	public static void main(String[] args) {
		/*
		 * Create a method createEmail(). Based on values of users name,lastName and email type, your method should return complete email Address.
		 * Example: createEmail(John, Snow, gmail) → johnsnow@gmail.com
		 */
		HW5 a = new HW5();
		a.email("Oleg", "Shin", "yahoo");
	}

}
