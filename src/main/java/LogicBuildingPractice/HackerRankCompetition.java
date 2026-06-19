package LogicBuildingPractice;

import java.util.HashMap;

public class HackerRankCompetition {

	public static void main(String[] args) {
		String erica = "EMH";
		String bob = "HHH";
		// ScoreCard
		HashMap<Character, Integer> scoreCard = new HashMap<Character, Integer>();
		scoreCard.put('E', 1);
		scoreCard.put('M', 3);
		scoreCard.put('H', 5);

		int erica_final_score = 0;
		int bob_final_score = 0;
		if (erica.length() != bob.length()) {
			System.err.println("Constraint Applied No Output Possible");
			System.err.println("Length of Erica and Bob should be same");
			System.exit(0);
		} else {
			for (int i = 0; i < erica.length(); i++) {
				char ericaPoint = erica.charAt(i);
				char bobPoint = bob.charAt(i);
				erica_final_score = erica_final_score + scoreCard.get(ericaPoint);
				bob_final_score = bob_final_score + scoreCard.get(bobPoint);
			}
			if (erica_final_score > bob_final_score) {
				System.out.println("Winner is Erica : " + erica_final_score);
			} else if (erica_final_score < bob_final_score) {
				System.out.println("Winner is Bob :" + bob_final_score);
			} else if (erica_final_score == bob_final_score) {
				System.out.println("Its a Tie");
			}
		}
	}

}
