import java.util.Scanner;

/**
 * 
 */

/**
 * @author Tobias
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2015 - how are you now? :)");

		String username = askForUsername();
		HelloUser hu = new HelloUser(username);

		hu.greetUser();

	}

	public static String askForUsername() {

		String username = "";

		// create a scanner so we can read the command-line input
		Scanner scanner = new Scanner(System.in);

		// prompt for the user's name
		System.out.print("Please enter your name: ");

		// get their input as a String
		username = scanner.next();

		scanner.close();

		return username;
	}

}
