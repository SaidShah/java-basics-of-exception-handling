package p2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Student john = new Student("mike",3.5);
		System.out.println(john);
		try {
			john.setGpa(5.0);
		} catch (InvalidGpaException e) {// we are using our own exception class that we made but all of this should be done
											// in the student class and not in the demo
			double gpa;
			do {	// this do while statement loops until the correct input is entered
				e.getMessage();
				System.out.println("Invalid Gpa renter gpa: ");
				gpa = keyboard.nextDouble();
			} while (gpa< 0.0 || gpa > 4.0);
			john.setGpa(gpa);
		}	// this throws a error with the message
		john.setName("Bill");// you will never reach here because of the exception on set Gpa
		System.out.println(john);
	}

}












