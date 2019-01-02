package p2;

public class InvalidGpaException extends RuntimeException {// we extend the runtime exception because it dosen't require us
	public InvalidGpaException(){							// to catch everything
		super();
	}

	public InvalidGpaException(String messge){
		System.out.println("invalid gpa");
	}

}
