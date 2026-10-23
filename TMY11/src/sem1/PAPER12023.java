package sem1;

public class PAPER12023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	static int SUM(int[][]dices) {
		int sum = 0; 
		for(int i = 0; i<dices.length; i++) {
			for(int j = 0; j<dices[i].length; i++) {
				sum += dices[i][j];
			}
		}
		return sum;
	}
	static int DuplicateNum(int[][]dices, int r) {
		if(dices[r][0] == dices[r][1] || dices[r][1] == dices[r][2]) {
			return dices[r][1];
		}
		return 0;
	}
	static int[] highestRT(int[][]dices) {
		int max = 0;
		int[]sums = new int[dices.length];
		int[]highestRT = new int[dices.length];
		for(int i = 0; i < dices.length; i++) {
			int sum = 0;
			for(int j = 0; j < dices[i].length; j++) {
				sum+= dices[i][j];
			}
			sums[i] = sum;
			if(sum>max) {
				max = sum;
			}
		}
		int hrtIndex = 0;
		for(int i = 0; i<dices.length; i++) {
			if(sums[i] == max) {
				highestRT[hrtIndex++] = sums[i];
			}
		}
		return highestRT;
	}
	static int getHighAmount(int[][]scores) {
		int count = 0;
		for(int i = 0; i<scores.length; i++) {
			for(int j = 0; j<scores[i].length; j++) {
				if(scores[i][j] == 10) {
					count++;
				}
			}
		}
		return count;
	}
	static void printFinals(int[][]scores, String[]names) {
		for(int i = 0; i<scores.length; i++) {
			int sum = 0;
			for(int j = 0; j<scores[i].length; j++) {
				sum += scores[i][j];
			}
			int finalGrade = sum/scores[i].length;
			System.out.println("Name: " + names[i] + "Final Score: " + finalGrade);
		}
	}
}
