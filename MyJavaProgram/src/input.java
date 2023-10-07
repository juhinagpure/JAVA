
//How to take input from the user
 
import java.util.Scanner;

public class input{
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("what is your name?");
		String name = Scanner.nextLine();
		System.out.println("How old are you?");
		int age = Scanner.nextInt();
		Scanner.nextLine();
		System.out.println("What is your favorite food");
	    String food = Scanner.nextLine();
	    
		System.out.println("Hello "+name);
		System.out.println("You are "+age+" years old");
		System.out.println("You like "+food);
		}
}