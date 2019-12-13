/*Alex Bowman
 * HW#10
 * Professor Silvestri
 * 12/12/19
 */
package quadratic;
import java.util.Scanner;
public class QuadraticDriver {

	private final static String TITLE = "Quadratic Equation Solver V1.0";
	private final static String CONTINUE_PROMPT = "Do this again? [y/N] ";
	
	//**********************************************
	// Put as many methods you need here
	
	
	//**********************************************
	// Start your logic coding in the process method
	private static void process(Scanner sc, String args[]) {
		System.out.print("Enter coefficients of the Quadratic: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		sc.nextLine();  // Clear Keyboard
		Quadratic q = new Quadratic(a, b, c);
		int noOfRoots = q.noOfRoots();
		if (noOfRoots == 2) {
			double r1 = q.getRoot1();
			double r2 = q.getRoot2();
			System.out.printf("Two Roots = %.3f, %.3f\n", r1, r2);
		}
		else if (noOfRoots == 1) {
			double r = q.getRoot1();
			System.out.printf("One Root = %.3f\n", r);
		}
		else {
			System.out.println("No Real Roots\n");
		}
	}
	
	//**********************************************
	// Do not change the doThisAgain method
	private static boolean doThisAgain(Scanner sc, String prompt) {
		System.out.print(prompt); 
		String doOver = sc.nextLine();
		return doOver.trim().equalsIgnoreCase("Y");
	}
	
	//**********************************************
	// Do not change the main method
	public static void main(String args[]) {
		System.out.println("Welcome to " + TITLE);
		Scanner sc = new Scanner(System.in);
		do {
			process(sc, args);
		} while (doThisAgain(sc, CONTINUE_PROMPT));
		sc.close();
		System.out.println("Thank you for using " + TITLE);
	}

}