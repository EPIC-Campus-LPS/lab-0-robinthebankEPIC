package scoretracker;

import java.util.Scanner;

public class ScoreTracker {
	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		int score1;
		System.out.println("Score 1:");
		score1 = scanner1.nextInt();
		
		Scanner scanner2 = new Scanner(System.in);
		int score2;
		System.out.println("Score 2:");
		score2 = scanner2.nextInt();
		
		Scanner scanner3 = new Scanner(System.in);
		int score3;
		System.out.println("Score 3:");
		score3 = scanner3.nextInt();
		
		int total = score1 + score2 + score3;
		int avgScore = total / 3;
		int stars = total % 5;
		
		System.out.println("Total Score : " + total);
		System.out.println("Average Score : " + avgScore);
		System.out.println("Stars Earned : " + stars);
		
		scanner1.close();
		scanner2.close();
		scanner3.close();
		
	}
}
