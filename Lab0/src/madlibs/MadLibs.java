package madlibs;
import java.util.Scanner;

public class MadLibs {
	public static void main(String[] args) {
		Scanner verb = new Scanner(System.in);
        System.out.println("Pick a verb: ");
        String Verb = verb.nextLine();
        
        Scanner adjective = new Scanner(System.in);
        System.out.println("Pick a adjective: ");
        String Adjective = adjective.nextLine();
        
        Scanner noun = new Scanner(System.in);
        System.out.println("Pick a noun: ");
        String Noun = noun.nextLine();
        
        
        System.out.println("They wanted to " + Verb + " a " + Adjective + " " + Noun + " for the science fair.");
	}
}
