package HomeWork;

public class HW6 {
	
	void prime(int num) {
		
		boolean f = true;
		if(num==0 || num==1) {
			System.out.println(num + " is not prime number");
		} else if(num==2) {
			System.out.println(num + " is a prime number");
		} else {
			for(int ab = 2; ab<=num/2; ab++) {
				if(num%ab==0) {
					f = false;
					System.out.println(num + " is not a prime number");
					break;
				} 
			}
		}
		if(f == true) {
			System.out.println(num + " is prime number");
		}
	
	}
	public static void main(String[] args) {
		
		// Write a method to return whether given number is prime or not? 
		
		HW6 a = new HW6();
		a.prime(11);
	}

}
