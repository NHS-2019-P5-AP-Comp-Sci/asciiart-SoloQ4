/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using
 * ASCII (American Standard Code for Information Interchange). Using the already
 * created file named `ASCIIArt.java` write a program that outputs your artwork
 * to the console. The goal of this project is to use ONLY what we have learned
 * in Unit 1 to create anything you would like so be creative (and school
 * appropriate). Artwork must also have a caption describing what it's
 * depicting.
 * 
 * For those of you who have dabbled in coding before, try to contain your code
 * to just what we have discussed in this unit.
 * 
 * @author Mr. Rasmussen
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	
	// In this code there is a rocket that has Mr. Rasmussen in it.
	// The rocket will fly for him if he gives the creator a good grade

	public static void triangle() {

		System.out.println("          /\\ ");
		System.out.println("         //\\\\ ");
		System.out.println("        //  \\\\ ");
		System.out.println("       //    \\\\ ");
		System.out.println("      //      \\\\ ");
		System.out.println("     //________\\\\ ");
		System.out.println("    /____________\\");

	}

	public static void person() {

		System.out.println("      |  Mr. R  |");
		System.out.println("      |  _____  |");
		System.out.println("      | | o o | |");
		System.out.println("      |  \\___/  |");
		System.out.println("      |    |    |");
		System.out.println("      |  \\ | /  |");
		System.out.println("      |   \\|/   |");
		System.out.println("      |    |    |");
		System.out.println("      |    |    |");
		System.out.println("      |    |    |");
		System.out.println("      |   / \\   |");
		System.out.println("      |  /   \\  |");
		System.out.println("      |_________|");

	}

	public static void butt() {

		System.out.println("      /         \\ \n     /           \\ \n    /_____________\\");

	}

	public static void fire() {

		System.out.println("     \"\"\"\"    \"\"\"\"");
		System.out.println("    \"\"\"\"\"\"  \"\"\"\"\"\"");
		System.out.println("     VVVV    VVVV");

	}

	public static void rocket() {

		System.out.println("   Here is your rocket!");
		System.out.println();
		triangle();
		person();
		butt();
		fire();
		System.out.println();
		System.out.println(
				"P.S. Hi Mr. Rasmussen, this rocket will give you one free ride to any \npocket of the galaxy if you give me an exceptional grade on this assignment :)");
	}

	public static void main(String[] args) {

		rocket();

	}
}