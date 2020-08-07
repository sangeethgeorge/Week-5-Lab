package Week5;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class UserString {

	public static void main(String[] args) {
		File file = new File ("userStrings.txt");
		String done = "Done";
		System.out.println("Enter String:");
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();
		if (string.equals(done)) {
			System.exit(0);
		} else {
		try {
		PrintWriter output = new PrintWriter(file);
		output.println(scan);
		output.close();
		} catch (Exception e) {
			System.out.println("Error!");
		}
		}
	}

}
