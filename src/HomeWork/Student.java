package HomeWork;

public class Student {
	
	void grade (int score){
		if(score>90) {
			System.out.println("Your grade is A");
		} else if(score>=80&&score<=89) {
			System.out.println("Your grade is B");
		} else if(score>=70&&score<=79) {
			System.out.println("Your grade is C");
		} else if(score>=50&&score<=69) {
			System.out.println("Your grade is D");
		} else
			System.out.println("Your grade is F");
		
	}
	public static void main(String[] args) {
		/*
		 * Create class Student that will have a method getGrade. Your method should accept the score of a
		 * student and return a grade: score > 90 - A score >80 - B score >70 - C score
		 * > 50 - D anything else - F
		 */
		Student a = new Student();
		a.grade(75);
	}

}
