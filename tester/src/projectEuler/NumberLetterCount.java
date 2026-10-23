package projectEuler;

public class NumberLetterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] numbers= {"","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String [] tens = {"twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eigthy", "ninety"};
		String [] teens = {"eleven", "twelve", "thirteeen", "fourteen", "seventeen", "eighteen", "ninteen"};
		int firstNumber = 0;
		int secondNumber = 0;
		int thirdNumber = 0;
		int characthers = 0;
		for(int i = 1; i<=1000; i++) {
			if(i == 10) {
				characthers+=3;
			}else if(i == 100) {
				characthers+=10;
			}else if(i == 1000) {
				characthers+=11;
			}else {
				if(i<10) {
					characthers += numbers[i-1].length();
				}else if(i<100) {
					if(Integer.toString(i).charAt(0) == '1') {
						characthers += teens[(i%10) -1].length();
					}else {
						characthers += tens[(i/10)-1].length();
					}
				}
			}
		}
		
		
		System.out.println(characthers);
	}

}
