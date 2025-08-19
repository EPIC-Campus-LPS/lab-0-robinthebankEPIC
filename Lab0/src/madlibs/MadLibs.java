package madlibs;
import java.util.Scanner;

public class MadLibs {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a verb: ");
        String Verb = scanner.nextLine();
        
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Pick a adjective: ");
        String Adjective = scanner1.nextLine();
        
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Pick a noun: ");
        String Noun = scanner.nextLine();
        
        
        System.out.println("They wanted to " + Verb + " a " + Adjective + " " + Noun + " for the science fair.");
	scanner.close();
	scanner1.close();
	scanner2.close();
	}
}
