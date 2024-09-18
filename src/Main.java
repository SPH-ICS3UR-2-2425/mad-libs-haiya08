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
		
		//number to a string not so good
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Mad Libs!");
		System.out.println("What's your name?");
		String name = in.nextLine();
		System.out.println("One day, "+name+" wrote a Mad Lib in class!");
		
		int num1 = in.nextInt();
		in.nextLine();
		System.out.println("Enter a name: ");
		String person1 = in.nextLine();
		System.out.println("Enter another name: ");
		String person2 = in.nextLine();
		System.out.println("Enter a drink: ");
		String drink = in.nextLine();
		System.out.println("Enter an animal: ");
		String animal = in.nextLine();
		System.out.println("Enter a decimal number above 10: ");
		double decNumber = in.nextDouble();
		in.nextLine();
		System.out.println("Enter an outdoor location: ");
		String location = in.nextLine();
		System.out.println("Enter a high number: ");
		int score = in.nextInt();
		System.out.println("Enter an emotion ending in ing: ");
		String emotion = in.nextLine();
		System.out.println("Enter a number above 100: ");
		int score2 = in.nextInt();
		System.out.println("Pick a number 1 through 5");
		int score3 = in.nextInt();
		
		
		
	
		
		
		//story
		System.out.println ("Yesterday "+person1+" and "+person2+" were selling "+drink+" for "+score3+"" . After selling "+drink+" for  at "
			+" "+location+" for "+decNumber+" of minutes, a "+animal+" attacked and stole amount of money. "
			+ "person 1 and 2 started crying until a stranger decided to give them amount of money "); 
	}

}
