package turning100;
import java.util.Scanner;

public class Turning100 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("When were you born?");
		int year = scanner.nextInt();
		
		int hundred = year + 100;
		System.out.println("You will turn 100 in " + hundred);
		
		scanner.close();
	}

}
