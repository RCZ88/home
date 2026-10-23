package sem1;

public class quizTwoLooping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		//no.6
		for(int  i = 1; i<=num; i++) {
			for(int j = 1; j<=num-i; j++) {
				System.out.print("*");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		//no.7
		for(int i = 0; i< num; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=num-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//no.8
		int dots = 1;
		for(int i = 1; i<=num; i++) {
			for(int j = 0; j<5-i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j<dots; j++) {
				System.out.print("*");
			}
			dots+=2;
			System.out.println();
		}
		
	}

}
