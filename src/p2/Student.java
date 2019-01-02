package p2;

public class Student {
	private String name;
	private double gpa;

	public Student(String name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		if(gpa<0.0 || gpa > 4.0){
			try{
				throw new InvalidGpaException("Invalid Gpa");
			}catch (InvalidGpaException e){
					do{
						System.out.println(e.getMessage());
						System.out.println("enter gpa again");
					//	gpa = keyboard.nextDouble();

				}

			//throw new InvalidGpaException();// this is our own exception that we created
			//throw new InvalidGpaException("Invalid Gpa");// this is the exception that we created that prints a message
			//throw new IllegalArgumentException("Invalid gpa entry");// this throws a new error message that we catch
		}
		this.gpa = gpa;
	}
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

}
