package scoretracker;

import java.util.Scanner;

public class ScoreTracker {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score1;
		System.out.println("Score 1:");
		score1 = scanner.nextInt();
		
		System.out.println("Score 2:");
		int score2 = scanner.nextInt();
		
		System.out.println("Score 3:");
		int score3 = scanner.nextInt();
		
		int total = score1 + score2 + score3;
		int avgScore = total / 3;
		int stars = total % 5;
		
		System.out.println("Total Score : " + total);
		System.out.println("Average Score : " + avgScore);
		System.out.println("Stars Earned : " + stars);
		
		scanner.close();
		
	}
}
