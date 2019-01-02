package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException {

		String[] names = new String[10];
		names[0]= "Adam";
		names[1] = "Bill";
		names[9]= "Charlie";
		names[5]= "zacky";

			// UNCHECKED RUNTIME EXCEPTION/ ERROR
		/*for(int i = 0; i <names.length;i++){
			System.out.println(names[i].length());
		}*/


		for(int i = 0;i<names.length;i++){
			if (names[i]!=null) {		// because you will get a null pointer exception error if null
				System.out.println(names[i].length());
			}
		}
		System.out.println();
		for(int i = 0;i<names.length;i++){
			if (names[i]==null) {		// this dosen't do anything if its null and moves on to the next index

			}else {
				System.out.println(names[i].length());
			}

		}

		System.out.println();
		for(int i = 0;i<names.length;i++){
			if (names[i]==null) {		// continues skips that place in the index if its null
				continue;
			}
			System.out.println(names[i].length());
		}

		System.out.println();
		//System.out.println(names[10]);// array index out of bounds exception because there is nothing there
										// the array has 10 elements 0 to 9

		//Scanner scanner = new Scanner(System.in);
		//System.out.println("input a number");
		//double num = scanner.nextDouble();
		//System.out.println("the number is "+ num);// could be input mismatch exception if person uses a letter instead a
													// number

		// this is a checked error and you must have exception handling to deal with it
		// so an alternative solutions must be provided for checked errors just in case there is an error
		/*File file = new File("data.txt");// has to throw a file not found exception just in case
		Scanner input = new Scanner(file);*/// the method run and the file is not found

		System.out.println();
		for(int i = 0; i <names.length;i++){// this throws a null pointer exception
			try{
			System.out.println(names[i].length());// this tries the code and if it throws a exception it catches it
			} catch(NullPointerException e){
				e.printStackTrace();// this prints the error message but does not crash
									// if you don't print the error it just shows nothing but program dosen't crash
				// 						print stack trace is a much more detailed message of what went wrong
			//	System.out.println(e.getMessage());// this prints the message for what went wrong because the exception is an object
			}
		}
		System.out.println("for loop is finished");

		for(int i = 0; i <names.length;i++){// this throws a null pointer exception
			try{
			System.out.println(names[i].length());// so java will tell you that the array index out of bounds
			} catch(ArrayIndexOutOfBounds e){// is not valid here because thats that the error that could happen here
				e.printStackTrace();
			}
		}
		System.out.println("for loop is finished");


		for(int i = 0; i <names.length;i++){// this throws a null pointer exception
			try{
			System.out.println(names[i].length());//
			} catch(RuntimeException e){// this catches every kind of runtime exception without having to classify which
				e.printStackTrace();//		one your looking for
			}
		}
		System.out.println("for loop is finished");


		for(int i = 0; i <names.length;i++){// this throws a null pointer exception
			try{
			System.out.println(names[i].length());// so java will tell you that the array index out of bounds
			}catch (Exception e){
				e.printStackTrace();// Exception is the super class to other exceptions besides throwable
			}						// so once you have the exception class exception you don't need to catch other exceptions
			catch (NullPointerException e){// multiple exceptions are allowed and its better to catch specific exceptions
				e.printStackTrace();		// rather than use a big exception class because individual exceptions tell you
			}								// where the problem is and exception class dosen't
			catch(RuntimeException e){// is not valid here because thats that the error that could happen here
				e.printStackTrace();
			}

		}
		System.out.println("for loop is finished");














	}

}
