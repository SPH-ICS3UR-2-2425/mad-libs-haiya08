import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: 
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Mad Libs!");
		System.out.println("What's your name?");
		String name = in.nextLine();
		System.out.println("One day, "+name+" wrote a Mad Lib in class!");
		
		int num1 = in.nextInt();
		
		
		String verb1;
		String person;
		System.out.println ("One day while "+verb1+" to class, "+person+" tripped on a fruit peel and fell into a bicycle rack!");
	}

}
