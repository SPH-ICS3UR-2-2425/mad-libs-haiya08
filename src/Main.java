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
		System.out.println("Enter an outdoor location that starts with 'the': ");
		String location = in.nextLine();
		System.out.println("Enter an emotion ending in ing: ");
		String emotion = in.nextLine();
		System.out.println("Enter a number above 100: ");
		int score2 = in.nextInt();
		System.out.println("Pick a number 1 through 5");
		int score3 = in.nextInt();
		System.out.println("Pick another number 50-100 ");
		int score4 = in.nextInt();
		
		//story

		System.out.println ("Yesterday "+person1+" and "+person2+" were selling "+drink+" for "+score3+" dollars at "+location+" . "
				+ "After selling "+drink+" at "+location+" for "+decNumber+" minutes, a "+animal+""
				+ " attacked them and stole "+score4+" dollars from them . "
				+ ""+person1+" and "+person2+" started "+emotion+" until a good samaritan saw what happend and decided "
				+ "to give them "+score2+" dollars"); 

}
