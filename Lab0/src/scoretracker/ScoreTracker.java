package scoretracker;

import java.util.Scanner;

public class ScoreTracker {
	public static void main(String[] args) {
		Scanner scoreOne = new Scanner(System.in);
		int score1;
		System.out.println("Score 1:");
		score1 = scoreOne.nextInt();
		
		Scanner scoreTwo = new Scanner(System.in);
		int score2;
		System.out.println("Score 2:");
		score2 = scoreTwo.nextInt();
		
		Scanner scoreThree = new Scanner(System.in);
		int score3;
		System.out.println("Score 3:");
		score3 = scoreThree.nextInt();
		
		int total = score1 + score2 + score3;
		int avgScore = total / 3;
		int stars = total % 5;
		
		System.out.println("Total Score : " + total);
		System.out.println("Average Score : " + avgScore);
		System.out.println("Stars Earned : " + stars);
		
	}
}
