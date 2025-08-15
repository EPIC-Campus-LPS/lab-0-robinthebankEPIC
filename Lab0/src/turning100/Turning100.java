package turning100;
import java.util.Scanner;

public class Turning100 {
	public static void main(String[] args) {
		Scanner birthYear = new Scanner(System.in);
		int year;
		System.out.println("When were you born?");
		year = birthYear.nextInt();
		
		int hundred = year + 100;
		System.out.println("You will turn 100 in " + hundred);
	}

}
